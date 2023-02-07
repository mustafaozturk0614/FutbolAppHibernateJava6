package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Player;
import com.bilgeadam.service.PlayerService;

public class PlayerController {

    PlayerService playerService;

    public PlayerController() {
        this.playerService = new PlayerService();
    }

    public void createPlayer(Player player) {
        playerService.save(player);
    }
}
