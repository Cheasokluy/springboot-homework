package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
	

}
