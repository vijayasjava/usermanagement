package com.microservices.usermanagement.repo.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.microservices.usermanagement.model.jpa.UserEntity;

@Repository("userJpaRepo")
public interface UserRepo extends PagingAndSortingRepository<UserEntity, Long> {

	
}
