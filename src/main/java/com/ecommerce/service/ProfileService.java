package com.ecommerce.service;

import java.util.List;


import com.ecommerce.entity.Profile;


public interface ProfileService {
	
	
	List<Profile> getAllProfile();
	Profile getProfileById(Long id);
	Profile createProfile(Profile profile);
	Profile updateProfile(Profile profile,Long id);
	void deleteProfile(Long id);
	
	
	

}
