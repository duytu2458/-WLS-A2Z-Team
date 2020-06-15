package vn.vtd.wls.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.vtd.wls.admin.service.AdminService;
import vn.vtd.wls.model.Member;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminServices;
	
	@Autowired
	private Member member;
	
	// @ModelAttribute("listMember")
	// public List<Member> name1() {
	// 	List<Member> list1 =  adminServices.getListMember();
	// 	return list1;
	// }
	
	@RequestMapping("/listMember")
	public String getListMember(Model model) {
		adminServices.getAdd();
		List<Member> listAllMembers =  adminServices.getListMember();
		System.out.println(listAllMembers.size());
		model.addAttribute("listAllMembers", listAllMembers);
		model.addAttribute("objMember",new Member());
		
		return "WLS-AD02";
		
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Member> listAllMembers =  adminServices.getListMember();
		System.out.println(listAllMembers.size());
		model.addAttribute("listAllMembers", listAllMembers);
		model.addAttribute("objMember",new Member());
		
		return "WLS-AD02";
	}
	
	@RequestMapping("/getSaveMember")
	public String getSaveMember(@ModelAttribute("objMember") Member member ) {

		
		System.out.println(member.getAccount());
		System.out.println(member.getFullName());
		System.out.println(member.getGender());
		System.out.println(member.getRole());
		System.out.println(member.getPhone());
		System.out.println(member.getPassWord());
		
		adminServices.getSaveMember(member);
		return "redirect:/list";
	}
	
	
	
}

