package videocon.content.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import videocon.service.details.SearviceDao;
import videocon.service.details.SearviceDaoImp;


@Controller
public class ServiceController {
	
	@RequestMapping("/subscription")
	public ModelAndView getSubscriptionPackages(){
		ModelAndView modelAndView =  new ModelAndView();
		
		SearviceDao sd  = new SearviceDaoImp();
		List<String> services = new ArrayList<String>();
		services = sd.getServicePackages();
		modelAndView.addObject("service_details", services);
		modelAndView.addObject("language_change_url","subscription");
		modelAndView.setViewName("subscription");
		return modelAndView;
	}

}
