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

public class Power {

    Integer power_shot_power;
    Integer power_jumping;
    Integer power_stamina;
    Integer power_strength;
    Integer power_long_shots;


}
