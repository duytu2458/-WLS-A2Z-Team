package vn.vtd.wls.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.vtd.wls.admin.repositories.AdminRepositories;
import vn.vtd.wls.model.Member;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepositories adminRepositories;

	public List<Member> getListMember() {
		return adminRepositories.getListMember();
	}
	
}
