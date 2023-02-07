package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Club;
import com.bilgeadam.utility.MyFactoryRepository;

public class ClubRepository extends MyFactoryRepository<Club, Long> {

    public ClubRepository() {
        super(new Club());
    }
}
