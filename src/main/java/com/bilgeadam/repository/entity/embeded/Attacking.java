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
public class Attacking {
    private Integer attacking_crossing;
    private Integer attacking_finishing;
    private Integer attacking_heading_accuracy;
    private Integer attacking_short_passing;
    private Integer attacking_volleys;

}
