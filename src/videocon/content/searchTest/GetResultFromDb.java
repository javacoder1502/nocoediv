/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocon.content.searchTest;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import videocon.content.searchTest.MaharajaDb;

/**
 *
 * @author Kunal
 */
public class GetResultFromDb {
 MaharajaDb db = null;
   // DynamicDb dd = null;

    public GetResultFromDb() {
        db = MaharajaDb.create();
      
    }

    public List<ViewController> getResultAccordingToTable(String tbl_name) {
        List<ViewController> ls = new ArrayList<ViewController>();

        String str = "select name,prv,pricetag from  " + tbl_name + " order by rand() limit 18 ";
        ResultSet rs = db.selectData(str);
        try {
            while (rs.next()) {
                ViewController vc = new ViewController();
                vc.setName(rs.getString(1));
                vc.setPrv(rs.getString(2));
                vc.setPricetag(rs.getString(3));
                ls.add(vc);

            }

        } catch (Exception e) {
            System.out.println(" Exception in getResultAccordingToTable of class GetResultFromDb " + e);
        }
        return ls;

    }
    
    
    public List<ViewController> getResultAccordingToTableAndName(String tbl_name,String name) {
        List<ViewController> ls = new ArrayList<ViewController>();

        String str = "select name,prv,pricetag from  " + tbl_name + " where name like '%"+name+"%' order by rand() limit 18";
        ResultSet rs = db.selectData(str);
        try {
            while (rs.next()) {
                ViewController vc = new ViewController();
                vc.setName(rs.getString(1));
                vc.setPrv(rs.getString(2));
                vc.setPricetag(rs.getString(3));
                ls.add(vc);

            }

        } catch (Exception e) {
            System.out.println(" Exception in getResultAccordingToTable of class GetResultFromDb " + e);
        }
        return ls;

    }
    public List<ViewController> getResultAccordingToTableAndCat(String tbl_name,String cat) {
        List<ViewController> ls = new ArrayList<ViewController>();

        String str = "select name,prv,pricetag from  " + tbl_name + " where cat like '%"+cat+"%' order by rand() limit 18";
        ResultSet rs = db.selectData(str);
        try {
            while (rs.next()) {
                ViewController vc = new ViewController();
                vc.setName(rs.getString(1));
                vc.setPrv(rs.getString(2));
                vc.setPricetag(rs.getString(3));
                ls.add(vc);

            }

        } catch (Exception e) {
            System.out.println(" Exception in getResultAccordingToTable of class GetResultFromDb " + e);
        }
        return ls;

    }
    
    
    
    public String getDistinctCat(String tbl_name){
      String all_distinct_cat ="";
        String str = "select distinct(cat) from "+tbl_name;
        ResultSet rs=db.selectData(str);
        try {
            
        while(rs.next()){
            all_distinct_cat =all_distinct_cat+ rs.getString(1);
            all_distinct_cat=all_distinct_cat+" ";
        }
        } catch (Exception e) {
            System.out.println(" Exception in getDistinctCat fo class GetResultFromDb "+e);
        }
        all_distinct_cat = all_distinct_cat.toLowerCase();
        System.out.println(" String of all distinct cat "+all_distinct_cat);
        return all_distinct_cat;
    }

}
