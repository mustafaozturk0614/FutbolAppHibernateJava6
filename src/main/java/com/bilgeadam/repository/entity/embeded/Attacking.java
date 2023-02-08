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
public class Attacking {
    @Column(columnDefinition = "int default 0")
    private int attacking_crossing;
    @Column(columnDefinition = "int default 0")
    private int attacking_finishing;
    @Column(columnDefinition = "int default 0")
    private int attacking_heading_accuracy;
    @Column(columnDefinition = "int default 0")
    private int attacking_short_passing;
    @Column(columnDefinition = "int default 0")
    private int attacking_volleys;

}
