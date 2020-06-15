package vn.vtd.wls.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vn.vtd.wls.admin.service.AdminService;
import vn.vtd.wls.model.Member;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminServices;
	
	// @ModelAttribute("listMember")
	// public List<Member> name1() {
	// 	List<Member> list1 =  adminServices.getListMember();
	// 	return list1;
		
	// }
	
	@RequestMapping("/listMember")
	public String getListMember(Model model) {
		// name1();
		List<Member> list1 =  adminServices.getListMember();
		model.addAttribute("listMember", list1);
		return "/screenAdmin/WLS-AD02";
	}
	
	
	@RequestMapping("/handelException")
	public ModelAndView handelException(Model model ) {
		
		
		
		
		
		return null;
		
	}
	
	
	
}

