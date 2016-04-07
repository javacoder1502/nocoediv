package videocon.content.DownloadController;

import videocon.content.DownloadClasses.GetSendingContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContentDownload {


	    @RequestMapping(value = "/download", method = RequestMethod.GET)
	    public void download(HttpServletResponse response,@RequestParam ("cat_type") String cat_type
	    		,@RequestParam ("content_name") String content_name) throws IOException {
	 
	    	
	    	if((cat_type == null)|| cat_type.equalsIgnoreCase("")){
	    		System.out.println();
	    		cat_type = getContentType(content_name);
	    	}
	    	
	    	 GetSendingContent gs =  new GetSendingContent();
	         String profile  = "";
	         
	         String path = gs.getContentFullPath(cat_type, content_name, profile, true);
	        File file = new File(path);
	        InputStream is = new FileInputStream(file);
	 
	        // MIME type of the file
	        response.setContentType("application/octet-stream");
	        // Response header
	        response.setHeader("Content-Disposition", "attachment; filename=\""
	                + file.getName() + "\"");
	        response.setContentLength((int)file.length());
	        // Read from the file and write into the response
	        OutputStream os = response.getOutputStream();
	        byte[] buffer = new byte[1024];
	        int len;
	        while ((len = is.read(buffer)) != -1) {
	            os.write(buffer, 0, len);
	        }
	        os.flush();
	        os.close();
	        is.close();
	    }
	
	    
	    
	    public String getContentType(String content_name){
	         int  i = content_name.indexOf("/");
	      content_name  = content_name.substring(0,i);
	      return content_name;
	    }
	
	
	
}
