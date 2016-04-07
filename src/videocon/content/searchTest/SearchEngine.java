/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocon.content.searchTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Kunal
 */
public class SearchEngine {

    UserKeyword uk = null;

    public SearchEngine() {
        uk = new UserKeyword();

    }

    /*
     *This method will set the keyword as Strng 
     *and as list in UserKeyword class 
     */
    public void settingKeyword(String user_keyword) {
        user_keyword = user_keyword.toLowerCase();
        uk.setUser_keyword(user_keyword);
        String[] user_keyword_a = user_keyword.split("\\s+");
        uk.setUser_keyword_list(Arrays.asList(user_keyword_a));
    }
//"Wallpaper_s","Scrsaver_s","Video_s","Game_s","Truet_s"};
    public List<ViewController> getSearchResult() {
        SearchResult sr= new SearchResult(uk);
         List<ViewController> user_result_list = new ArrayList<ViewController>();
        
        String user_keyword = uk.getUser_keyword();
        if (user_keyword.contains("wallpaper") || user_keyword.contains("image") || user_keyword.contains("photo")) {
           user_result_list = sr.getResultByContentType("Wallpaper");
            System.out.println(" in wallpaper");
            return user_result_list;
        } 
        
        else if (user_keyword.contains("animation") || user_keyword.contains("screen saver") || user_keyword.contains("screensaver")) {
            System.out.println(" in animation");
           user_result_list = sr.getResultByContentType("Scrsaver");
            return user_result_list;
        } 
        
        else if (user_keyword.contains("game")) {
            System.out.println(" in game");
            user_result_list = sr.getResultByContentType("Game");
             return user_result_list;
        } 
        
        else if (user_keyword.contains("music") || user_keyword.contains("music zone")
                || user_keyword.contains("tone") || user_keyword.contains("songs") || user_keyword.contains("mp3") ){
            System.out.println(" in mp3");
          user_result_list =   sr.getResultByContentType("Truet");
           return user_result_list;
        } 
        
        else if (user_keyword.contains("video")) {
            System.out.println(" in video");
          user_result_list =   sr.getResultByContentType("Video");
           return user_result_list;
        } 
        
        else {
           user_result_list =  sr.getResultByRandom();
            
            System.out.println(" in else");
            return user_result_list;
        }

        
       
    }

    public static void main(String[] args) {
        String keyword = "musiczone am kunal";
        SearchEngine se = new SearchEngine();
        se.settingKeyword(keyword);
        se.getSearchResult();

    }

}
