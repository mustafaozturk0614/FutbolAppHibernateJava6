package com.bilgeadam.repository.entity.embeded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movement {
    private Integer movement_acceleration;
    private Integer movement_sprint_speed;
    private Integer movement_agility;
    private Integer movement_reactions;
    private Integer movement_balance;

}
