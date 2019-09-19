package com.microservices.usermanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.microservices.usermanagement.dto.UserDto;
import com.microservices.usermanagement.model.jpa.UserEntity;
import com.microservices.usermanagement.model.mongo.UserDocument;
import com.microservices.usermanagement.repo.jpa.UserRepo;

@Service
public class UserService {

	
	@Autowired
	@Qualifier("userJpaRepo")
	UserRepo userJpaRepo;
	
	@Autowired
	@Qualifier("userMongoRepo")
	com.microservices.usermanagement.repo.mongo.UserRepo userMongoRepo; 
	
	@Transactional
	public UserDto save(UserDto  userDto) {
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		userEntity = this.userJpaRepo.save(userEntity);
		
		
		UserDocument userDocument = new UserDocument();
		BeanUtils.copyProperties(userDto, userDocument);
		
		userEntity.setEmailVerified(Boolean.FALSE);
		userEntity.setUsername("TOBEDONEUSER");
		userEntity.setEncryptedPassword("TOBEDONE");
		
		this.userMongoRepo.save(userDocument);
		
		userDto = new UserDto();
		BeanUtils.copyProperties(userEntity, userDto);
		
		return userDto;
		
	}
}
