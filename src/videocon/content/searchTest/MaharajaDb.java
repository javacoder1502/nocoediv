/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocon.content.searchTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Kunal
 */
public class MaharajaDb {

    private static MaharajaDb db = null;
    private Connection conn = null;
    private Statement stmt = null;

    private MaharajaDb(String dbname) {

        String db_user = "root";
        String db_pass = "";

        String database = "";
       

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///" + dbname, db_user, db_pass);
            stmt  = conn.createStatement();
        } catch (Exception e) {
            System.err.println("Error in Database Connection " + e);
        }

    }
    
    public static MaharajaDb create(){
        String dbname="videocon";
        if(db==null || db.conn==null || db.stmt==null){
            System.out.println(" create insta of db ");
            db = new MaharajaDb(dbname);
        }
        return db;
    }
    
    public ResultSet selectData(String str){
          ResultSet rs = null;
        try {
            if(stmt == null){
                System.out.println(" statement null");
            }
            
            System.out.println(" str "+str);
            rs= stmt.executeQuery(str);
            
           
        } catch (Exception e) {
            
            System.out.println(" exception in Dbconnection  in select query "+e);
        }
        return rs;
    }
    
    public int updateData(String str){
          ResultSet rs = null;
          int  i =0;
           System.out.println(" str "+str);
        try {
              if(stmt == null){
                System.out.println(" statement null in update ");
                
            }
          i = stmt.executeUpdate(str);
        } catch (Exception e) {
            System.out.println(" exception in Dbconnection  in updateData query "+e);
        }
        return  i;
    }
    
    public  void close(){
        if(conn!=null){
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(" Exception in closing connection  in close method "+e);
            }
        }
    }
    
}
