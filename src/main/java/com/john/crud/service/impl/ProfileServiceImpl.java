package com.john.crud.service.impl;

import com.john.crud.entity.Profile;
import com.john.crud.repository.ProfileRepository;
import com.john.crud.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    @Override
    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile updateProfile(Long id, Profile profileDetails) {

        Profile profile = profileRepository.findById(id).orElse(null);
        if (profile != null) {
            profile.setName(profileDetails.getName());
            profile.setEmail(profileDetails.getEmail());
            profile.setPhone(profileDetails.getPhone());
            profile.setAddress(profileDetails.getAddress());
            return profileRepository.save(profile);
        }
          return null;
    }

    @Override
    public void deleteProfile(Long id) {

        profileRepository.deleteById(id);

    }
}
