package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Player;
import com.bilgeadam.utility.MyFactoryRepository;

public class PlayerRepository extends MyFactoryRepository<Player, Long> {

    public PlayerRepository() {
        super(new Player());
    }


}
