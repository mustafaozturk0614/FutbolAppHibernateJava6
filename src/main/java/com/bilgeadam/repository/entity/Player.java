package com.bilgeadam.repository.entity;

import com.bilgeadam.repository.entity.embeded.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String long_name;
    @Enumerated(EnumType.STRING)
    PlayerPositions player_positions;
    int overall;
    int potential;
    double value_eur;
    double wage_eur;
    int age;
    double height_cm;
    double weight_kg;
    String club_position;
    int club_jersey_number;
    String club_contract_valid_until;
    String nationality_name;
    String preferred_foot;
    int pace;
    int shooting;
    int passing;
    int dribbling;
    int defending;
    int physic;
    @Embedded
    Attacking attacking;
    @Embedded
    Defending defence;
    @Embedded
    Golkepping golkepping;
    @Embedded
    Mentality mentality;
    @Embedded
    Movement movement;
    @Embedded
    Power power;
    @Embedded
    Skill skill;
    @ManyToOne()
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    Club club;


}
