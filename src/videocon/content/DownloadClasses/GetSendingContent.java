/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocon.content.DownloadClasses;

import java.io.File;


/**
 *
 * @author Kunal
 */
public class GetSendingContent {
    
    //public static final String root_content_path="/usr/local/apache-tomcat-8.0.27/webapps/m4u/CMS;
    public static final String root_file_path="/usr/src/apache-HTTP/webapps/IdeaWap/CMS/Content";
    
    
    
    public String getContentFullPath(String cat_type,String content_name,String profile,boolean isProfilebyAgent){
        //cat_type = cat_type.toLowerCase();
        String path = "";
        if(cat_type.equalsIgnoreCase("Wallpaper")|| cat_type.equalsIgnoreCase("Animation")){
           path = getContentWithResolution(cat_type,content_name,profile,isProfilebyAgent);
           return path;
        }else{
           path  =  getContentWithoutResolution(cat_type,content_name);
           return path;
        }
        
    }
    
    public  String getContentWithResolution(String cat_type,String content_name,String profile,boolean isProfilebyAgent){
//        url2hex   url2hex =  new url2hex();
        String content_path="";
        String format="";
       /* String size=getSize(profile, isProfilebyAgent);*/
        String size="400x240";
        content_name = getContentName(content_name);
        format=getFormat(cat_type);
        //content_path = root_content_path+"/"+cat_type+"/"+size+"/"+content_name+format;
        String file_path = root_file_path+"/"+cat_type+"/"+size+"/"+content_name+format;
        System.out.println(" file path is "+file_path);
        File file = new File(file_path);
        if(!file.exists()){
           
              content_path =  root_file_path+"/"+cat_type+"/400x240/"+content_name+format;
               System.out.println(" file doesnt exists storing default size "+content_path);
        }
        System.out.println("content_path  is  "+content_path);
        content_path = file_path;
//        content_path  =   url2hex.getWapPushHex(content_path,"Enjoy Your Content");
        return content_path;
    }
    
    public String getContentWithoutResolution(String cat_type,String content_name){
        System.out.println(" cat_type :"+cat_type);
//         url2hex   url2hex =  new url2hex();
        String content_path="";
        String format="";
        content_name = getContentName(content_name);
        format=getFormat(cat_type);
        System.out.println(" format :"+format);
        content_path = root_file_path+"/"+cat_type+"/"+content_name+format;
//       content_path  =  url2hex.getWapPushHex(content_path,"Enjoy Your Content");
        return content_path;
    }
    
   
    
    
    /*
    *Pass profile name and isProfilebyAgent and this method will return the 
    *profile resolution
    */
    /*public String getSize(String profile,boolean isProfilebyAgent){
        checkMobileMime cmm = new checkMobileMime();
        String size="";
         if (isProfilebyAgent) {
                size = cmm.getScreenSizebyUseragent(profile);
            } else {
                size = cmm.getScreenSize(profile);
            }
         return size;
    }*/
    
    public String getContentName(String content_name){
        int i = content_name.indexOf("/");
        content_name = content_name.substring(i+1);
        content_name = content_name.substring(0, content_name.lastIndexOf("."));
        return content_name;
    }
     public String getFormat(String cat_type){
         System.out.println(" cat_type in format : "+cat_type);
         String content_format_name="";
         if(cat_type.equalsIgnoreCase("wallpaper")){
             content_format_name=".jpg";
         }
         if(cat_type.equalsIgnoreCase("video")){
             content_format_name=".3gp";
         }
         if(cat_type.equalsIgnoreCase("animation")){
             content_format_name=".gif";
         }
         if(cat_type.equalsIgnoreCase("ringtone")){
             content_format_name=".mp3";
         }
         if(cat_type.equalsIgnoreCase("game")){
             content_format_name=".apk";
         }
         return content_format_name;
     }
    
    public static void main(String[] args) {
//        GetSendingContent cm =  new GetSendingContent();
//        cm.getContentName("wallpaper/hh/hhhhll.jpg");
    }
}
