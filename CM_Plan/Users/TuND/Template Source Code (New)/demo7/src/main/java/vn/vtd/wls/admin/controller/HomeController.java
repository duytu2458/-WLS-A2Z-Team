package vn.vtd.wls.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.vtd.wls.admin.dto.UserSearch;
import vn.vtd.wls.admin.service.IUserService;
import vn.vtd.wls.entitys.UserEntity;

@Controller
public class HomeController {
	
	@Autowired
	UserEntity userEntity;
	
	@Autowired
	IUserService userService;
	
	@Autowired
	UserSearch userSearch;
	
	@Autowired
	UserController userController;

	@GetMapping(value = "/{locale:en|vi}/admin/manage-users")
	public String member(Model model) {
		userSearch.setAccount("");
		userSearch.setFullName("");
		userSearch.setPm(null);
		userSearch.setPhone("");
		
		return userController.showList(model,userSearch,"1");
	}

	
	
	
	

}
