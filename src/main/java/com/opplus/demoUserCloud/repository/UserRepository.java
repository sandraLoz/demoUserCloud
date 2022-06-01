package com.opplus.demoUserCloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.opplus.demoUserCloud.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	
	
}

