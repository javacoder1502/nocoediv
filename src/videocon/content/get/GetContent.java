package videocon.content.get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import videocon.content.dao.ContentDao;
import videocon.content.dao.ContentDaoImp;
import videocon.content.domain.ContentCatAndImages;
import videocon.content.domain.ContentCatList;
import videocon.content.domain.ContentDes;

public class GetContent {
	
	public List<ContentDes> getRandContent(String content_type){
		ContentDao contentDao =  new ContentDaoImp(content_type);
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		contentDes_ls = contentDao.getRandomContent(9);
		return contentDes_ls;
	}
	
	public List<ContentDes> getContentCatWise(String content_type,String cat){
		//contructor of ContentDaoImp will set the table name according to content_type
		ContentDao contentDao =  new ContentDaoImp(content_type);
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		contentDes_ls = contentDao.getContentCatWise(cat,9);
		return contentDes_ls;
	}
	
	
	
	public List<ContentCatList> getCatList(String content_type){
		ContentDao contentDao =  new ContentDaoImp(content_type);
		List<ContentCatList> ContentCatList_ls  = new ArrayList<ContentCatList>();
		ContentCatList_ls = contentDao.getDistinctCat();
		return ContentCatList_ls;
	}
	
	public List<ContentCatAndImages> getCatListAndContent(String content_type){
		
		ContentDao contentDao =  new ContentDaoImp(content_type);
		
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		List<ContentCatList> ContentCatList_ls  = new ArrayList<ContentCatList>();
		List<ContentCatAndImages> contentCatAndImages  = new ArrayList<ContentCatAndImages>();
		
		//storing the distinct cat list in ContentCatList_ls of class ContentCatList
		ContentCatList_ls = getCatList(content_type);
		
		System.out.println("size of ContentCatList_ls"+ContentCatList_ls.size());
		
		for(int i=0;i<ContentCatList_ls.size();i++){
			ContentCatAndImages ContentCatAndImages  =  new ContentCatAndImages(); 
			
			
			ContentCatList ContentCatList =  ContentCatList_ls.get(i);
			
			//setting cat name to the domain class of ContentCatAndImages
			ContentCatAndImages.setCat_name(ContentCatList.getCat_name());
			//getting the list of content accoring to the cat name 
			contentDes_ls = getContentCatWiseWIthLimit(content_type,ContentCatList.getCat_name(),3);
			System.out.println("size of contentDes_ls "+contentDes_ls.size());
			List<String> ls=   new ArrayList<String>();
			
			for(int j=0;j<contentDes_ls.size();j++){
				ContentDes contentDes = contentDes_ls.get(j);
				 String prv_name =	contentDes.getContent_prv();
				 System.out.println("prv_name "+prv_name);
			        ls.add(prv_name);
				
			}
			
			ContentCatAndImages.setLs(ls);
			contentCatAndImages.add(ContentCatAndImages);
			
		}
		
		
		
		
		return contentCatAndImages;
	}
	
	
	public List<ContentDes> getContentCatWiseWIthLimit(String content_type,String cat,int limit){
		//contructor of ContentDaoImp will set the table name according to content_type
		ContentDao contentDao =  new ContentDaoImp(content_type);
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		contentDes_ls = contentDao.getContentCatWise(cat,limit);
		return contentDes_ls;
	}
	
	
	public List<ContentDes> getRandContentExceptDevotional(String content_type){
		ContentDao contentDao =  new ContentDaoImp(content_type);
		List<ContentDes> contentDes_ls  = new ArrayList<ContentDes>();
		contentDes_ls = contentDao.getRandContentExceptDevotional(9);
		return contentDes_ls;
	}
	
	
	
	

}
