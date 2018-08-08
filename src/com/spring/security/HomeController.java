package com.spring.security;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	
	@RequestMapping(value="/appointments",method=RequestMethod.GET)
	public String goHome(){
		System.out.println("Inside the appointments controller!");
		return "appointments";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String goServices(){
		System.out.println("Inside the advanced search controller!");
		return "search";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String goBack(){
		System.out.println("Inside the home controller!");
		return "index";
	}
	
	@RequestMapping("/formlogin")
	public String goFormLogin(){
		return "formlogin";
	}
	
	@RequestMapping("/login")
	public String goLogin(){
		return "login";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String loadDefaultPage(){
		System.out.println("Inside the dfault method controller!");
		return "index";
	}
}