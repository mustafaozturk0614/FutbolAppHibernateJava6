package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Club;
import com.bilgeadam.repository.entity.League;
import com.bilgeadam.service.ClubService;

public class ClubController {

    ClubService clubService;

    public ClubController() {
        this.clubService = new ClubService();
    }

    public void createClub(Club club) {
        clubService.save(club);
    }

    public void deleteById(Long id) {
        clubService.deleteById(id);

    }


    public Club saveWithName(String s, League league) {

        return clubService.saveWithName(s, league);
    }
}
