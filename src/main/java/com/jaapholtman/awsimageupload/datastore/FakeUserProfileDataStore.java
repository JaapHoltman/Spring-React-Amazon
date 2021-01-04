package com.jaapholtman.awsimageupload.datastore;

import com.jaapholtman.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//dit is een in-memory database die opgeslagen wordt in List<UserProfile>
@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("8cb6d26c-7be4-4b3f-a296-db1030dcbe89"), "Janet-Jones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("39472d5a-650d-4c93-96cd-1cd34c009b4c"), "Antonio-Junior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
