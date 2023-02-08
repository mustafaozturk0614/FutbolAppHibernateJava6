package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Player;
import com.bilgeadam.service.PlayerService;

import java.util.List;

public class PlayerController {

    PlayerService playerService;

    public PlayerController() {
        this.playerService = new PlayerService();
    }

    public void createPlayer(Player player) {
        playerService.save(player);
    }

    public void deleteById(long id) {
        playerService.deleteById(id);
    }


    public void createPlayers(List<Player> players) {

        playerService.saveAll(players);
    }

    public void deleteByEntity(Player player) {
        playerService.delete(player);
    }

    public List<Player> findAll() {

        return playerService.findAll();
    }
}
