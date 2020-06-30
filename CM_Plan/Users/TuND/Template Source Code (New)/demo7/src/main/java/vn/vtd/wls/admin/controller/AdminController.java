package vn.vtd.wls.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javassist.expr.NewArray;
import vn.vtd.wls.admin.service.IUserService;
import vn.vtd.wls.admin.service.impl.UserService;
import vn.vtd.wls.entitys.UserEntity;

@Controller
public class AdminController {
	
	@Autowired
	UserEntity userEntity;
	
	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/admin/manage-members", method = RequestMethod.GET)
	public String member(Model model) {
		List<UserEntity> list = userService.findAll();
		model.addAttribute("listAllMembers",list);
		model.addAttribute("objectUser", new UserEntity());
		return "/views/admin/WLS-AD02";
	}
	
	
	@RequestMapping(value = "/admin/manage-members/save", method = RequestMethod.POST)
	public String save(@ModelAttribute ("objectUser") UserEntity userEntity) {
		if (null != userEntity) {
			userService.save(userEntity);
		}
		return "redirect:/admin/manage-members";
	}
	
	
	
	
}
