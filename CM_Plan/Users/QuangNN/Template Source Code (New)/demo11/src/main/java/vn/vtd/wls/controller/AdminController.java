package vn.vtd.wls.controller;

import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.vtd.wls.common.Handling;
import vn.vtd.wls.entitys.UserEntity;
import vn.vtd.wls.form.UserForm;
import vn.vtd.wls.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	UserService userService;

	public AdminController(UserService userService) {
		this.userService = userService;
	}

//	@ModelAttribute("userEntity")
//	public UserEntity setUpUserEntity() {
//		return new UserEntity();
//	}

	@GetMapping(value = { "/home" })
	public String showAdmin(Model model) {
		List<UserEntity> listUser = userService.findAll();
		model.addAttribute("listUser", listUser);
		return "/admin/home";
	}

	@GetMapping(path = { "/create" })
	public String createUser(Model model) {
		return "admin/fragment :: create";
	}
	
	@PostMapping(path = { "/registUser" })
	public String registUser(Model model, UserForm userForm) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userForm, userEntity);
		
		userEntity.setFullName(Handling.getStandardFullName(userForm.getFullName()));
		String account = userService.getAccountFromFullName(userEntity.getFullName());
		userEntity.setAccount(account);
		userEntity.setEnable(true);
		
		userService.save(userEntity);
		
		model.addAttribute("account", account);
		return "admin/fragment :: regist-success";
	}
}
