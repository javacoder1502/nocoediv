package videocon.content.dao;

import java.util.ArrayList;
import java.util.List;

import videocon.content.domain.ContentCatList;
import videocon.content.domain.ContentDes;
//import videocon.content.domain.repository.ContentDomain;
import videocon.content.utility.HibernateOperations;

public class ContentDaoImp extends ContentDao {
	HibernateOperations ho =  new HibernateOperations();
	
	
	//this  will set the table name accoriing to the content_type
	public ContentDaoImp(String content_type){
		setTbl_name(content_type);
	}
	
	@Override
	public List<ContentDes> getContentPriceWise(String price, String limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContentDes> getContentCatWise(String cat, int limit) {

		List<Object[]> ls  = new ArrayList<Object[]>();
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		
		String sql_query = "select prv,pricetag from "+getTbl_name()+" where cat like '"+cat+"' order by rand()";
		
		try{
	      ls = ho.getResultListByLimit(sql_query,limit);
	      
	      for(Object[] obj: ls){
		      /*  Integer id = (Integer)obj[0];*/
		         String firstName = (String)obj[0];
		         String pricetag =(String)obj[1];
		         ContentDes contentDes = new ContentDes();
		         contentDes.setContent_prv(firstName);
		         contentDes.setContent_name(pricetag);
		         contentDes_ls.add(contentDes);
	      }
	      
	      
	      for(int i =0;i<contentDes_ls.size();i++){
	    	  ContentDes contentDes =contentDes_ls.get(i);
	    	 
	      }
	    
		}catch(Exception ex){
			System.out.println( "exceptio in getRandomContent "+ex);
		}
		
		// TODO Auto-generated method stub
		return contentDes_ls;
	}

	@Override
	public List<ContentDes> getRandomContent(int limit) {
		
		List<Object[]> ls  = new ArrayList<Object[]>();
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		
		String sql_query = "select prv,pricetag from "+getTbl_name()+"  order by rand()";
		
		try{
	      ls = ho.getResultListByLimit(sql_query,limit);
	      
	      for(Object[] obj: ls){
		      /*  Integer id = (Integer)obj[0];*/
		         String firstName = (String)obj[0];
		         String pricetag =(String)obj[1];
		         ContentDes contentDes = new ContentDes();
		         contentDes.setContent_prv(firstName);
		         contentDes.setContent_name(pricetag);
		         contentDes_ls.add(contentDes);
	      }
	      
	      
	      for(int i =0;i<contentDes_ls.size();i++){
	    	  ContentDes contentDes =contentDes_ls.get(i);
	    	 
	      }
	    
		}catch(Exception ex){
			System.out.println( "exceptio in getRandomContent "+ex);
		}
		
		// TODO Auto-generated method stub
		return contentDes_ls;
	}

	@Override
	public List<ContentCatList> getDistinctCat() {
		
		List<Object> ls  = new ArrayList<Object>();
		List<ContentCatList> contentCatList_ls  = new ArrayList<ContentCatList>();
		
		String sql_query = "select distinct(cat) from "+getTbl_name()+"  group by cat";
		System.out.println("step -3 "+sql_query);
		try{
	      ls = ho.getListForSingleColumn(sql_query);
	      for(int i=0;i<ls.size();i++){
	    	  ContentCatList contentCatList = new ContentCatList();
	    	  contentCatList.setCat_name((String)ls.get(i));
	    	  contentCatList_ls.add(contentCatList);
	      }

		}catch(Exception ex){
			System.out.println( "exceptio in getRandomContent "+ex);
		}
		
		
		return contentCatList_ls;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
	}

	@Override
	public List<ContentDes> getRandContentExceptDevotional(int limit) {

		List<Object[]> ls  = new ArrayList<Object[]>();
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		
		String sql_query = "select prv,pricetag from "+getTbl_name()+" where cat not like 'Holy Deities' order by rand()";
		
		try{
	      ls = ho.getResultListByLimit(sql_query,limit);
	      
	      for(Object[] obj: ls){
		      /*  Integer id = (Integer)obj[0];*/
		         String firstName = (String)obj[0];
		         String pricetag =(String)obj[1];
		         ContentDes contentDes = new ContentDes();
		         contentDes.setContent_prv(firstName);
		         contentDes.setContent_name(pricetag);
		         contentDes_ls.add(contentDes);
	      }
	      
	      
	      for(int i =0;i<contentDes_ls.size();i++){
	    	  ContentDes contentDes =contentDes_ls.get(i);
	    	 
	      }
	    
		}catch(Exception ex){
			System.out.println( "exceptio in getRandomContent "+ex);
		}
		
		// TODO Auto-generated method stub
		return contentDes_ls;
		
	}

	

}
