package com.john.crud.service;

import com.john.crud.entity.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfileService {

    List<Profile> getAllProfiles();
    Profile getProfileById(Long id);
    Profile createProfile(Profile profile);
    Profile updateProfile(Long id, Profile profileDetails);
    void deleteProfile(Long id);
}
