package com.bilgeadam;

import com.bilgeadam.controller.ClubController;
import com.bilgeadam.controller.LeaugeController;
import com.bilgeadam.controller.PlayerController;
import com.bilgeadam.repository.entity.Club;
import com.bilgeadam.repository.entity.League;
import com.bilgeadam.repository.entity.Player;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClubController clubController = new ClubController();
        PlayerController playerController = new PlayerController();
        LeaugeController leaugeController = new LeaugeController();
        League league = League.builder().league_name("superlig").build();
        Club club = Club.builder().club_name("MyClub").league(league).build();

        Player player = Player.builder().long_name("futbolcu1").club(club).build();
        playerController.createPlayer(player);

        Thread.sleep(2000);

        clubController.deleteById(1L);


    }
}