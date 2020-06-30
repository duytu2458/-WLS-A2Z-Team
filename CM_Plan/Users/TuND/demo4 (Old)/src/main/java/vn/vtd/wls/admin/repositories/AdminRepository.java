package vn.vtd.wls.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.vtd.wls.model.Member;

@Repository
public interface AdminRepository extends JpaRepository<Member,String>{
	
	
}
