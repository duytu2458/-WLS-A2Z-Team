package vn.vtd.wls.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.vtd.wls.admin.repositories.AdminRepository;
import vn.vtd.wls.model.Member;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public void getAdd() {
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("Acc1","FullName1","PM","Male","Phone1","Pass01"));
		list.add(new Member("Acc2","FullName2","PM","Female","Phone2","Pass01"));
		list.add(new Member("Acc3","FullName3","","Male","Phone3","Pass01"));
		list.add(new Member("Acc4","FullName4","","Female","Phone4","Pass01"));
		list.add(new Member("Acc5","FullName5","PM","Male","Phone5","Pass01"));
		list.add(new Member("Acc6","FullName6","","Female","Phone6","Pass01"));
		list.add(new Member("Acc7","FullName7","PM","Male","Phone7","Pass01"));
		for (Member member : list) {
			adminRepository.save(member);
		}
	}
	
	public List<Member> getListMember() {
		return adminRepository.findAll();
	}

	public Member getSaveMember(Member member) {
		return adminRepository.save(member);
	}

	
}
