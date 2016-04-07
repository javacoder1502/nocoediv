/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocon.content.searchTest;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Kunal
 */
public class SearchResult {

    UserKeyword uk = null;
    GetResultFromDb gd = new GetResultFromDb();

    public SearchResult(UserKeyword uk) {
        this.uk = uk;
    }

    public List<ViewController> getResultByContentType(String tbl_name) {
        List<String> user_keyword_list = new ArrayList<String>();
        List<ViewController> temp_result_list = new ArrayList<ViewController>();
        List<ViewController> user_result_list = new ArrayList<ViewController>();

        user_keyword_list = uk.getUser_keyword_list();
        if (user_keyword_list.size() == 1) {
            temp_result_list = gd.getResultAccordingToTable(tbl_name);
            user_result_list.addAll(temp_result_list);
            return user_result_list;
        } else {
            //matching user keyword with cat
            for (int i = 0; i < user_keyword_list.size(); i++) {
                String all_sistinct_cat = gd.getDistinctCat(tbl_name);
                if (all_sistinct_cat.contains(user_keyword_list.get(i))) {
                    System.out.println(" " + all_sistinct_cat + " contains " + user_keyword_list.get(i));
                    temp_result_list = gd.getResultAccordingToTableAndCat(tbl_name, user_keyword_list.get(i));
                    user_result_list.addAll(temp_result_list);

                    if (user_result_list.size() >= 18) {
                        return user_result_list;
                    }

                }

            }

            //matching user keyword with name
            for (int i = 0; i < user_keyword_list.size(); i++) {
                temp_result_list = gd.getResultAccordingToTableAndName(tbl_name, user_keyword_list.get(i));
                user_result_list.addAll(temp_result_list);

                if (user_result_list.size() >= 18) {
                    return user_result_list;
                }
            }

        }
        
       if (user_result_list.size() >= 18) {
          user_result_list = gd.getResultAccordingToTable(tbl_name);
                    return user_result_list;
                }

        return user_result_list;
    }

    
    public List<ViewController> getResultByRandom() {
        String[] all_table = uk.getAll_table();
        List<String> user_keyword_list = new ArrayList<String>();
        List<ViewController> user_result_list = new ArrayList<ViewController>();
        List<ViewController> temp_result_list = new ArrayList<ViewController>();
        user_keyword_list = uk.getUser_keyword_list();
        //matching user keyword with cat
        for (int i = 0; i < all_table.length; i++) {
            System.out.println(" in first for rand ");
     
            for (int j = 0; j < user_keyword_list.size(); j++) {
            	
                String all_sistinct_cat = gd.getDistinctCat(all_table[i]);
                
                System.out.println(" user_keyword_list.get(j)) "+user_keyword_list.get(j));
                
                
                System.out.println(all_sistinct_cat.contains(user_keyword_list.get(j)));
                if (all_sistinct_cat.contains(user_keyword_list.get(j))) {
                    System.out.println(" " + all_sistinct_cat + " contains " + user_keyword_list.get(j));
                    temp_result_list = gd.getResultAccordingToTableAndCat(all_table[i], user_keyword_list.get(j));
                    user_result_list.addAll(temp_result_list);

                    if (user_result_list.size() >= 18) {
                        return user_result_list;
                    }

                }

            }
               }
        
        
        for (int i = 0; i < all_table.length; i++) {
              System.out.println(" in second for rand ");
     
            for (int j = 0; j < user_keyword_list.size(); j++) {
                     temp_result_list = gd.getResultAccordingToTableAndName(all_table[i], user_keyword_list.get(j));
                    user_result_list.addAll(temp_result_list);

                    if (user_result_list.size() >= 18) {
                        return user_result_list;
                    }

                }

            
               }
        
          return user_result_list;
        
        
    }
    
}
