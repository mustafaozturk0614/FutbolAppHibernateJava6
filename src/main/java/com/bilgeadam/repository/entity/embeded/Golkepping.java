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

public class Golkepping {
    Integer goalkeeping_diving;
    Integer goalkeeping_handling;
    Integer goalkeeping_kicking;
    Integer goalkeeping_positioning;
    Integer goalkeeping_reflexes;
    Integer goalkeeping_speed;


}
