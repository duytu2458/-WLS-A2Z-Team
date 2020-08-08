package vn.vtd.wls.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.vtd.wls.entitys.UserEntity;
import vn.vtd.wls.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	UserService userService;

	public AdminController(UserService userService) {
		this.userService = userService;
	}

	@ModelAttribute("userEntity")
	public UserEntity setUpUserEntity() {
		UserEntity userEntity = new UserEntity();
		userEntity.setAccount("QuangNN16");
		return userEntity;
	}

	@GetMapping(value = { "/home" })
	public String showAdmin(Model model) {
		List<UserEntity> listUser = userService.findAll();

		model.addAttribute("listUser", listUser);

		return "/admin/home";
	}

	@GetMapping(path = { "/create" })
	public String createAdmin(Model model) {
		return "admin/fragment :: create";
	}
}
