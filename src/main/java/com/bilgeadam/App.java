package com.bilgeadam;

import com.bilgeadam.controller.ClubController;
import com.bilgeadam.controller.LeaugeController;
import com.bilgeadam.controller.PlayerController;
import com.bilgeadam.repository.entity.Club;

import java.util.Optional;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    PlayerController playerController = new PlayerController();
    ClubController clubController = new ClubController();
    LeaugeController leaugeController = new LeaugeController();
    Club myClub;

    public static void main(String[] args) {
        App app = new App();
        app.mainMenu();

    }


    public void mainMenu() {

        int input = 0;

        do {
            System.out.println("=========Football APP===========");
            System.out.println("1-Takım seç");
            System.out.println("2-Takımları görüntüle");
            System.out.println("3-Ligleri gorüntüle");
            System.out.println("4-Takım-Yonetim-Menusu");
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println(selectClub());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }


        } while (input != 0);


    }

    private Club selectClub() {
        clubController.findAll().forEach(s -> System.out.println(s.getId() + "-" + s.getClub_name()));
        System.out.println("Lütfen klüp-idsi giriniz");
        Long id = Long.parseLong(scanner.nextLine());
        Optional<Club> club = clubController.findById(id);
        if (club.isPresent()) {
            return club.get();
        } else {
            return null;
        }
    }

}
