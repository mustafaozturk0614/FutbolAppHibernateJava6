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
public class Mentality {
    Integer mentality_aggression;
    Integer mentality_interceptions;
    Integer mentality_positioning;
    Integer mentality_vision;
    Integer mentality_penalties;
    Integer mentality_composure;


}
