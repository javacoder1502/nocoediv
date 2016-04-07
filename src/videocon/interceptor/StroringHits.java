package videocon.interceptor;

import videocon.content.table.Waphit;
import videocon.content.utility.HibernateOperations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class StroringHits extends HandlerInterceptorAdapter {


	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String msisdn = "", profile = "", accpt = "", size = "", filepath = "";
        java.util.Enumeration e = request.getHeaderNames();
        
        
		 while (e.hasMoreElements()) {
	            String key = (String) e.nextElement();
	            key = key.trim();

	            if ((key.indexOf("msisdn") > -1) || (key.indexOf("MSISDN") > -1)) {
	                msisdn = request.getHeader(key);
	                if (msisdn.length() > 12) {
	                    msisdn = (msisdn.substring(msisdn.indexOf("919"))).trim();
	                }
	            }
	            if (key.equals("x-wap-profile")) {

	                String val = request.getHeader(key);
	                profile = val.substring(val.indexOf("http"), val.length());
	                profile = profile.replaceAll("\"", "");

	            }
	            if (key.indexOf("accept-") < 0 && key.indexOf("accept") > -1) {
	                String val = request.getHeader(key);
	                accpt = val;

	            }
	        }
		 
		  boolean isProfilebyAgent = false;

          System.out.println(" value of profile before checking user_agent  " + profile);
          if (profile.equalsIgnoreCase("") || profile.length() == 0) {
              System.out.println("  profie is zero  storing useragent  in ");
              isProfilebyAgent = true;
              System.out.println(" value of  isProfilebyAgent in if " + isProfilebyAgent);
              profile = request.getHeader("user-agent");
              System.out.println(" value of  isProfilebyAgent in  profile " + isProfilebyAgent);
//          pw.println(" storing user agent in profile " + profile);
          }
		 
		 String url_name   = request.getRequestURL().toString() + "?" + request.getQueryString();
		 System.out.println(url_name);
		 String ipAddress = request.getRemoteAddr();
		Waphit wp =  new Waphit(msisdn, url_name, profile, ipAddress);
		HibernateOperations ho  = new HibernateOperations();
		ho.SaveObject(wp);
		
		
			return true;
	
	}
	
}