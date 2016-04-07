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
public class sample {
    
    public   void printList(){
        List<String> user_keyword_list =  new ArrayList<String>();
        user_keyword_list = getList();
        System.out.println("user_keyword_list  "+user_keyword_list);
         user_keyword_list = getList1();
            System.out.println("user_keyword_list  "+user_keyword_list);
    }
    
    public List<String> getList(){
        List<String> user_keyword_list =  new ArrayList<String>();
        user_keyword_list.add("hello");
        user_keyword_list.add("hello2");
        user_keyword_list.add("hello3");
        return user_keyword_list;
    }
    
        public List<String> getList1(){
        List<String> user_keyword_list =  new ArrayList<String>();
        user_keyword_list.add("helloqaaaa");
        user_keyword_list.add("hello2aaaa");
        user_keyword_list.add("helloaaaa3");
        return user_keyword_list;
    }
    
    public static void main(String[] args) {
        sample s = new sample();
        s.printList();
    }
}
