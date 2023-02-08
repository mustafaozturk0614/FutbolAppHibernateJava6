package com.bilgeadam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ClubController clubController = new ClubController();
//        PlayerController playerController = new PlayerController();
//        LeaugeController leaugeController = new LeaugeController();
//        League league = League.builder().league_name("superlig").build();
//        Club club = Club.builder().club_name("MyClub").league(league).build();
//
//        Player player = Player.builder().long_name("futbolcu1").player_positions(PlayerPositions.GK).club(club).build();
//        Player player2 = Player.builder().long_name("futbolcu2").player_positions(PlayerPositions.GK).club(club).build();
//        Player player3 = Player.builder().long_name("futbolcu3").player_positions(PlayerPositions.CM).club(club).build();
//        //1den fazla player kaydediyor
//        playerController.createPlayers(List.of(player2, player, player3));
//        //      playerController.createPlayer(player);
//
//        playerController.findAll().forEach(System.out::println);
//
//
//        //   playerController.deleteById(1L);
//        //   playerController.deleteByEntity(player);
//        //     clubController.deleteById(1L);
//        //  leaugeController.deleteById(1L);

        List<String> list = new ArrayList<>();
        List<List<String>> newList = new ArrayList<>();
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("E:/futbol/superlig7.csv", StandardCharsets.UTF_8));
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {

                newList.add(Arrays.asList(line.split(";")));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newList.get(1).get(0));
    }


}