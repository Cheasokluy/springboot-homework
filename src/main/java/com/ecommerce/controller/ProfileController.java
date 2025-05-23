package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Profile;
import com.ecommerce.service.ProfileService;

@RestController
@RequestMapping("api/profile")

public class ProfileController {
	
	@Autowired
	private ProfileService profileServie;
	
	@GetMapping
	public List<Profile> getAllProfile(){
		return profileServie.getAllProfile();
	}
	@GetMapping("/{id}")
	public Profile getProfileById(@PathVariable Long id) {
		return profileServie.getProfileById(id);
	}
	
	@PostMapping
	public Profile createProfile(@RequestBody Profile profile) {
		return profileServie.createProfile(profile);
	}
	
	@PutMapping("/{id}")
	public Profile updateProfile(@RequestBody Profile profile, @PathVariable Long id) {
		return profileServie.updateProfile(profile, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProfile(@PathVariable Long id) {
		 profileServie.deleteProfile(id);
	}
	

}
