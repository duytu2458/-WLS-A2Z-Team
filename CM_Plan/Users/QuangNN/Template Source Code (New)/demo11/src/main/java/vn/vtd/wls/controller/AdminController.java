package vn.vtd.wls.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.vtd.wls.commons.Handling;
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
//		UserEntity userEntity = new UserEntity();
//		userEntity.setFullName("Nguyễn Ngọc Quang");
//		
//		return userEntity;
//	}

	@ModelAttribute("userForm")
	public UserForm setUpUserEntity() {
		return new UserForm();
	}

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
	public String registUser(@Validated UserForm userForm, BindingResult result, Model model ) {

		if (result.hasErrors()) {
			return "admin/fragment :: create";
		}

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
