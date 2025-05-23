package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Profile;
import com.ecommerce.repository.ProfileRepository;
import com.ecommerce.service.ProfileService;

@Service
public class serviceImpl implements ProfileService {
	
	@Autowired
	private ProfileRepository profileRepo;

	@Override
	public List<Profile> getAllProfile() {
		return profileRepo.findAll();
	}

	@Override
	public Profile getProfileById(Long id) {
		return profileRepo.findById(id).orElse(null);
	}

	@Override
	public Profile createProfile(Profile profile) {
		return profileRepo.save(profile);
	}

	@Override
	public Profile updateProfile(Profile profile, Long id) {
		Profile existingProfile = profileRepo.findById(id).orElse(null);
		if (existingProfile != null) {
			existingProfile.setFirstName(profile.getFirstName());
			existingProfile.setLastname(profile.getLastname());
			
			return profileRepo.save(existingProfile);
		}
		
		return null;
	}

	@Override
	public void deleteProfile(Long id) {
		profileRepo.deleteById(id);
	}
	

}
