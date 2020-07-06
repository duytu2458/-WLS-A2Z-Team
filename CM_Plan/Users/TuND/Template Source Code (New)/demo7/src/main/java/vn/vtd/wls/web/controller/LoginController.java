package vn.vtd.wls.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.vtd.wls.web.dto.Login;

@Controller
public class LoginController {
	
	@Autowired
	Login login;
	
	@RequestMapping(value = "/")
	public String home() {
		return "redirect:/en/login";
	}
	
	@RequestMapping(value = "/{locale:en|vi}/login")
	public String login(Model model) {
		model.addAttribute("login",login);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		return "/views/Login";
	}
	
	@GetMapping(value = "/{locale:en|vi}/getLogin")
	public String checkLogin(@ModelAttribute("login") Login login, Model model) {
		
		
		
		return "redirect:admin";
//		return "/views/user/...";
	}
	
	
	@RequestMapping(value = "/{locale:en|vi}/admin")
	public String admin() {
		
		return "/views/admin/WLS-AD01";
	}
	
	
	
	
	
	

}
