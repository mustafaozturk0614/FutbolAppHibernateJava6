package com.bilgeadam.repository.entity.embeded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skill {
    @Column(nullable = true)
    private int skill_dribbling;
    private Integer skill_curve;
    private Integer skill_fk_accuracy;
    private Integer skill_long_passing;
    private Integer skill_ball_control;

}
