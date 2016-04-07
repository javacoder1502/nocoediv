package videocon.content.controller;


/*import videocon.content.get.GetContent;
import videocon.content.searchTest.SearchEngine;
import videocon.content.searchTest.ViewController;*/

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import videocon.content.get.GetContent;
import videocon.content.searchTest.SearchEngine;
import videocon.content.searchTest.ViewController;

@Controller
public class ContentController {
	
	@RequestMapping("/index")
	public String process() {
		return "index";
	}
	
	@RequestMapping("/view")
	public String v() {
		return "ViewCat";
	}
	

	@RequestMapping("/GameCat")
	public ModelAndView gameCat(Locale locale,@RequestParam(value ="selectedValue", required=false) String selectListId) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCat",gc.getCatList("game"));
		modelAndView.addObject("content_type","Game");
		
		modelAndView.addObject("display_heading","Game");
		modelAndView.addObject("language_change_url","GameCat");
		
		
		//if selectListId is not present the  show users random content
		if(selectListId == null){
			System.out.println("selectListId is empty-----");
			modelAndView.addObject("contentDesc",gc.getRandContent("game"));
			
			
		}else{
			modelAndView.addObject("contentDesc",gc.getContentCatWise("Game",selectListId));
		}
		
		modelAndView.addObject("selectListId", selectListId);
		modelAndView.setViewName("content");
		return modelAndView;
	}
	
	@RequestMapping("/WallpaperCat")
	public ModelAndView wallpaperCat(Locale locale,@RequestParam(value ="selectedValue", required=false) String selectListId) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCat",gc.getCatList("wallpaper"));
		
		modelAndView.addObject("content_type","Wallpaper");
		modelAndView.addObject("display_heading","Images");
		
		modelAndView.addObject("language_change_url","WallpaperCat");
		if(selectListId == null){
			System.out.println("selectListId is empty-----");
			modelAndView.addObject("contentDesc",gc.getRandContent("wallpaper"));
			
			
		}else{
			modelAndView.addObject("contentDesc",gc.getContentCatWise("wallpaper",selectListId));
		}
		
		
		modelAndView.addObject("selectListId", selectListId);
		modelAndView.setViewName("content");
		return modelAndView;
	}
	
	
	@RequestMapping("/VideoCat")
	public ModelAndView videoCat(Locale locale,@RequestParam(value ="selectedValue", required=false) String selectListId) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCat",gc.getCatList("video"));
		
		modelAndView.addObject("content_type","Video");
		modelAndView.addObject("display_heading","Video");
		
		modelAndView.addObject("language_change_url","VideoCat");
		
		if(selectListId == null){
			System.out.println("selectListId is empty-----");
			modelAndView.addObject("contentDesc",gc.getRandContent("video"));
			
			
		}else{
			modelAndView.addObject("contentDesc",gc.getContentCatWise("video",selectListId));
		}
		
	
		modelAndView.addObject("selectListId", selectListId);
		modelAndView.setViewName("content");
		return modelAndView;
	}
	
	
	@RequestMapping("/AnimationCat")
	public ModelAndView animationCat(Locale locale,@RequestParam(value ="selectedValue", required=false) String selectListId) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCat",gc.getCatList("animation"));
		
		modelAndView.addObject("content_type","Animation");
		modelAndView.addObject("display_heading","Animations");
		
		modelAndView.addObject("language_change_url","AnimationCat");
		
		if(selectListId == null){
			System.out.println("selectListId is empty-----");
			modelAndView.addObject("contentDesc",gc.getRandContent("animation"));
			
			
		}else{
			modelAndView.addObject("contentDesc",gc.getContentCatWise("animation",selectListId));
		}
		
		
		
		modelAndView.addObject("selectListId", selectListId);
		modelAndView.setViewName("content");
		return modelAndView;
	}
	
	
	@RequestMapping("/RingtoneCat")
	public ModelAndView musicCat(Locale locale,@RequestParam(value ="selectedValue", required=false) String selectListId) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("contentCat",gc.getCatList("ringtone"));
	    
		modelAndView.addObject("content_type","Ringtone");
		modelAndView.addObject("display_heading","Music");
		
		modelAndView.addObject("language_change_url","RingtoneCat");
		
		//if selectListId is not present the  show users random content
		if(selectListId == null){
			System.out.println("selectListId is empty-----");
			modelAndView.addObject("contentDesc",gc.getRandContent("ringtone"));
			
			
		}else{
			modelAndView.addObject("contentDesc",gc.getContentCatWise("ringtone",selectListId));
		}
		
		
		modelAndView.addObject("selectListId", selectListId);
		modelAndView.setViewName("content");
		return modelAndView;
	}
	
	
	
	
	
	@RequestMapping("/Game")
	public ModelAndView game(Locale locale) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCatAndImages",gc.getCatListAndContent("game"));
		
		modelAndView.addObject("content_type","GameCat");
		
		
		modelAndView.addObject("language_change_url","Game");
		modelAndView.setViewName("ViewCat");
		return modelAndView;
	}
	
	@RequestMapping("/Wallpaper")
	public ModelAndView Wallpaper(Locale locale) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCatAndImages",gc.getCatListAndContent("Wallpaper"));
		modelAndView.addObject("content_type","WallpaperCat");
		modelAndView.addObject("language_change_url","Wallpaper");
		modelAndView.setViewName("ViewCat");
		return modelAndView;
	}
	
	@RequestMapping("/Video")
	public ModelAndView Video(Locale locale) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCatAndImages",gc.getCatListAndContent("video"));
		modelAndView.addObject("content_type","VideoCat");
		modelAndView.addObject("language_change_url","Video");
		modelAndView.setViewName("ViewCat");
		return modelAndView;
	}
	
	
	@RequestMapping("/Animation")
	public ModelAndView Animation(Locale locale) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCatAndImages",gc.getCatListAndContent("animation"));
		modelAndView.addObject("content_type","AnimationCat");
		modelAndView.addObject("language_change_url","Animation");
		modelAndView.setViewName("ViewCat");
		return modelAndView;
	}
	
	@RequestMapping("/Ringtone")
	public ModelAndView Music(Locale locale) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentCatAndImages",gc.getCatListAndContent("ringtone"));
		modelAndView.addObject("content_type","RingtoneCat");
		modelAndView.addObject("language_change_url","Ringtone");
		modelAndView.setViewName("ViewCat");
		return modelAndView;
	}
	

	@RequestMapping("/BuyOneGetOne")
	public ModelAndView BuyOneGetOne() {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentDesc",gc.getRandContent("video"));
		modelAndView.addObject("content_type","Video");
		modelAndView.addObject("language_change_url","BuyOneGetOne");
		modelAndView.setViewName("pack");
		return modelAndView;
	}
	
	@RequestMapping("/FreeZone")
	public ModelAndView FreeZone() {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentDesc",gc.getRandContentExceptDevotional("wallpaper"));
		modelAndView.addObject("content_type","Wallpaper");
		modelAndView.addObject("language_change_url","FreeZone");
		modelAndView.setViewName("pack");
		return modelAndView;
	}
	
	@RequestMapping("/PickOfDay")
	public ModelAndView PickOfDay() {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("contentDesc",gc.getRandContentExceptDevotional("Animation"));
		modelAndView.addObject("content_type","Animation");
		modelAndView.addObject("language_change_url","PickOfDay");
		modelAndView.setViewName("pack");
		return modelAndView;
	}
	
	
	
	
	
	
	@RequestMapping("/Search")
	public ModelAndView Search(@RequestParam ("users_keyword") String users_keyword) {
		List<ViewController> user_result_list = new ArrayList<ViewController>();
         SearchEngine se = new SearchEngine();
         se.settingKeyword(users_keyword);
         user_result_list = se.getSearchResult();
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("users_keyword",users_keyword);
		
		modelAndView.addObject("language_change_url","Search");
		modelAndView.addObject("user_result_list",user_result_list);
		
		modelAndView.setViewName("search");
		return modelAndView;
	}
	
	
	@RequestMapping("/allCatAjax")
	public ModelAndView allCatAjax(@RequestParam ("cat") String cat_name,@RequestParam ("content_type") String content_type) {
		GetContent gc = new GetContent();
		ModelAndView modelAndView = new ModelAndView();
		content_type = content_type.toLowerCase();
		modelAndView.addObject("contentDesc",gc.getContentCatWise(content_type,cat_name));
		modelAndView.setViewName("contentAjax");
		return modelAndView;
	}
	
	 

	
	

}
