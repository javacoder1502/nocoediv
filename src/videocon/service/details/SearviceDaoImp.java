package videocon.service.details;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import videocon.content.utility.HibernateOperations;

public class SearviceDaoImp extends SearviceDao{

	
	
	@Override
	public List<String> getAllSusbscriptionServiceId() {
		HibernateOperations hibernateOperations = new HibernateOperations();
		String sql_query="select service_id from Services_details where action like 'subscription'";
		
		List<String> ls_service_id =  new ArrayList<String>();
		List<Object> ls_obj =  new ArrayList<Object>();
		
		ls_obj = hibernateOperations.getListForSingleColumn(sql_query);
		
		for (Object object : ls_obj) {
			String s = (String)object;
			ls_service_id.add(s);
		}
		

		return ls_service_id;
	}

	@Override
	public String getServiceDetails() {
		List<String> ls_service_id =  new ArrayList<String>();
		ls_service_id = getAllSusbscriptionServiceId();
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public  String getSubscriptionService(String service_id){
       
      Map<String,String> service_details = new HashMap<String,String>();
      
        String  query= "select  wallpaper,video,ringtone,game,animation,price_point,service_id,service_name,day from  "
                + "Pack_details where service_id like '"+service_id+"'";
        
        
        List<Object[]> ls_details =  new ArrayList<Object[]>();
        HibernateOperations hibernateOperations = new HibernateOperations();
        ls_details   = hibernateOperations.getResultListByLimit(query, 1);
        
        for(Object[] obj: ls_details){
        	
        	 service_details.put("wallpaper", (String)obj[0]);
             service_details.put("video",(String)obj[1]);
             service_details.put("ringtone", (String)obj[2]);
             service_details.put("game", (String)obj[3]);
             service_details.put("animation", (String)obj[4]);
             service_details.put("price_point",(String)obj[5]);
             service_details.put("service_id", (String)obj[6]);
             service_details.put("service_name", (String)obj[7]);
             service_details.put("validity", (String)obj[8]);
        	 }
        
        StringBuilder sb =  new StringBuilder();
        sb.append(service_details.get("service_name"));
        sb.append("(");
        if(!service_details.get("wallpaper").equalsIgnoreCase("0")){
            sb.append(service_details.get("wallpaper")+" wallpaper+");
        }
        if(!service_details.get("video").equalsIgnoreCase("0")){
            sb.append(service_details.get("video")+" video+");
        }
        if(!service_details.get("ringtone").equalsIgnoreCase("0")){
            sb.append(service_details.get("ringtone")+" ringtone+");
        }
        if(!service_details.get("game").equalsIgnoreCase("0")){
            sb.append(service_details.get("game")+" game+");
        }
        if(!service_details.get("animation").equalsIgnoreCase("0")){
            sb.append(service_details.get("animation")+" animation+");
        }
        sb.append(")");
         
        sb.replace(sb.length()-2, sb.length(), ")");
        sb.append(" for "+service_details.get("price_point")+"rs "+ service_details.get("validity")+" Days");
        return sb.toString();
    }

	
	
	@Override
	public List<String> getServicePackages() {
		
		List<String> service_id = new ArrayList<String>();
		List<String> package_details = new ArrayList<String>();
		service_id = getAllSusbscriptionServiceId();
		
		
		for (String string : service_id) {
			package_details.add(getSubscriptionService(string));
		}
		
		return package_details;
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) {
		SearviceDao sd  = new SearviceDaoImp();
		List<String> services = new ArrayList<String>();
		services = sd.getServicePackages();
		for (String string : services) {
			System.out.println("service_darails "+string);
		}
		
	}

}
