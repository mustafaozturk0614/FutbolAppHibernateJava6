package com.bilgeadam.service;

import com.bilgeadam.repository.ClubRepository;
import com.bilgeadam.repository.entity.Club;
import com.bilgeadam.utility.MyFactoryService;

public class ClubService extends MyFactoryService<ClubRepository, Club, Long> {


    public ClubService() {
        super(new ClubRepository());
    }
}
