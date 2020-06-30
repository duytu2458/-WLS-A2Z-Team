package vn.vtd.wls.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.vtd.wls.admin.repository.IUserRepository;
import vn.vtd.wls.admin.service.IUserService;
import vn.vtd.wls.entitys.UserEntity;

@Service
public class UserService implements IUserService{

	@Autowired
	IUserRepository userRepository;

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void save(UserEntity userEntity) {
		userRepository.save(userEntity);
		
	}
}
