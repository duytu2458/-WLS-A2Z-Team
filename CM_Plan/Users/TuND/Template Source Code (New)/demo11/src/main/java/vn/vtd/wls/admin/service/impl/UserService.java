package vn.vtd.wls.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.vtd.wls.admin.dto.UserSearch;
import vn.vtd.wls.admin.repository.IUserRepository;
import vn.vtd.wls.admin.service.IUserService;
import vn.vtd.wls.entitys.UserEntity;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;

	@Override
	public Page<UserEntity> findAll(int pageNum) {
		Pageable pageable = PageRequest.of(pageNum - 1, 10);
		return userRepository.findAll(pageable);
	}
	
//	@Override
//	public Page<UserEntity> findAll(int pageNum,String sortField, String sortDrc) {
//		Pageable pageable = PageRequest.of(pageNum - 1, 5, 
//				sortDrc.equals("asc") ? Sort.by(sortField).ascending() : Sort.by(sortField).descending());
//		return userRepository.findAll(pageable);
//	}

	@Override
	public void save(UserEntity userEntity) {
		userRepository.save(userEntity);
	}

	@Override
	public Page<UserEntity> findByField(int pageNum, UserSearch userSearch) {

		Pageable pageable = PageRequest.of(pageNum - 1, 5);
		try {
			UserSearch userSearch2 = (UserSearch) userSearch.clone();
			if (userSearch2.getPm() == null) {
				return userRepository.findByField(userSearch2.getAccount(), userSearch2.getFullName(),
						userSearch2.getPhone(), pageable);
			} else {
				return userRepository.findByField(userSearch2.getAccount().trim(), userSearch2.getFullName(),
						userSearch2.getPm(), userSearch2.getPhone(), pageable);
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

}
