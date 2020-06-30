package vn.vtd.wls.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	@RequestMapping(value = "/")
	public String home() {
		return "redirect:login";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "/views/Login";
	}
	
	@RequestMapping(value = "/getLogin")
	public String admin() {
		
		return "/views/admin/WLS-AD01";
//		return "/views/user/...";
	}
	
	
	
	
	
	
	
	
	

}
