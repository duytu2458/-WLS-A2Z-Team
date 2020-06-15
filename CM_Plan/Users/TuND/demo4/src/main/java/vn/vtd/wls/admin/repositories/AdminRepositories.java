package vn.vtd.wls.admin.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.vtd.wls.model.Member;

@Repository
public class AdminRepositories {

	public List<Member> getListMember() {
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("Acc1","FullName1","Role1","Gender1","Phone1"));
		list.add(new Member("Acc2","FullName2","Role2","Gender2","Phone2"));
		list.add(new Member("Acc3","FullName3","Role3","Gender3","Phone3"));
		return list;
	}



}
