package vn.vtd.wls.admin.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.vtd.wls.admin.dto.UserSearch;
import vn.vtd.wls.admin.service.IUserService;
import vn.vtd.wls.entitys.UserEntity;

@Controller
@Component	
public class UserController {

	@Autowired
	UserEntity userEntity;

	@Autowired
	UserSearch userSearch;

	@Autowired
	IUserService userService;
	
	UserSearch userSearchAll = userSearch;
	

	@GetMapping(value = {"/{locale:en|vi}/admin/manage-users/page/{pageNum}"})
	public String showList(Model model,
			@ModelAttribute("objectSearch") UserSearch userSearch2,
			@PathVariable(name = "pageNum") String pageNum) {
		
		
		int pageNumInt = Integer.parseInt(pageNum);	
		Page<UserEntity> page = null;
		
		if (userSearch.getUserMappingFindAll().equals(userSearch2)) {
			page = userService.findAll(pageNumInt);
//			page = userService.findAll(pageNumInt,"account","dec");
		} else {
			page = userService.findByField(pageNumInt,userSearch2);
		}

		long totalItems = page.getTotalElements();
		int totoalPgaes = page.getTotalPages();
		
		List<UserEntity> list = page.getContent();
		
		model.addAttribute("listAllMembers", list);
		model.addAttribute("objectSearch", userSearch2);
		model.addAttribute("currentPage",pageNumInt);
		model.addAttribute("totalItems",totalItems);
		model.addAttribute("totalPages",totoalPgaes);
		
		return "/views/admin/WLS-AD02";
	}
	

	@PostMapping(value = "/{locale:en|vi}/admin/manage-users/save")
	@ResponseBody
	public Map<String, String> save(@Valid @RequestBody UserEntity userEntity, BindingResult bindingResult) {
		Map<String, String> messageMapList = new LinkedHashMap<>();
		
		if (bindingResult.hasErrors()) {
			ObjectError objectError = bindingResult.getFieldError();
			String fieldErrors = '"'+ ((FieldError) objectError).getField() + '"';			
			String messageError = bindingResult.getFieldError().getDefaultMessage();	
			messageMapList.put("message", "FAILURE : " + fieldErrors.toUpperCase() + " " + messageError + " !!!");	
			return messageMapList;
		}
		if (null != userEntity) {
			userService.save(userEntity);
			messageMapList.put("message", "SUCCESS !!!");
		} else {
			messageMapList.put("message", "Unstable server, please try again later !!!");
		}
		return messageMapList;
	}
	
	
	
	
	
	

	/*
	 * @RequestMapping(value = "/admin/manage-users/save", method =
	 * RequestMethod.POST) public String save(@Valid @ModelAttribute ("objectUser")
	 * UserEntity userEntity) { if (null != userEntity) {
	 * userService.save(userEntity); } return
	 * "redirect:/admin/manage-users/list-users"; }
	 */

	/*
	 * => Tương đương :
	 * 
	 * @RequestMapping(value = "/new",method = RequestMethod.POST)
	 * 
	 * @ResponseBody (Để định nghĩa đối tượng trả về sẽ chuyển thành Json) public
	 * NewDTO createNew1(@RequestBody NewDTO model) { return model; }
	 */

//	@GetMapping(value = "/admin/manage-users/search")
//	public String search(@ModelAttribute("objectSearch") UserSearch userSearch, Model model) {
//		return showList(model,userSearch,1);
//	}


	
	
	
	
	

}
