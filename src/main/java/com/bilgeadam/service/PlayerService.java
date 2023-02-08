package com.bilgeadam.service;

import com.bilgeadam.repository.PlayerRepository;
import com.bilgeadam.repository.entity.Player;
import com.bilgeadam.utility.MyFactoryService;

public class PlayerService extends MyFactoryService<PlayerRepository, Player, Long> {


    public PlayerService() {
        super(new PlayerRepository());
    }


}
