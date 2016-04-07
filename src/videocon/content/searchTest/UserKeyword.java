/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocon.content.searchTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kunal
 */
public class UserKeyword {
    
    private String user_keyword="";
   private String[] all_table = {"Wallpaper","Scrsaver","Video","Game"};
   private List<String> user_keyword_list =  new ArrayList<String>();
   private List<ViewController> users_result_list =  new ArrayList<ViewController>();

    public String[] getAll_table() {
        return all_table;
    }
    
    

    public List<ViewController> getUsers_result_list() {
        return users_result_list;
    }

    public void setUsers_result_list(List<ViewController> users_result_list) {
        this.users_result_list = users_result_list;
    }

    public String getUser_keyword() {
        return user_keyword;
    }

    public void setUser_keyword(String user_keyword) {
        this.user_keyword = user_keyword;
    }

    public List<String> getUser_keyword_list() {
        return user_keyword_list;
    }

    public void setUser_keyword_list(List<String> user_keyword_list) {
        this.user_keyword_list = user_keyword_list;
    }
   
    
}
