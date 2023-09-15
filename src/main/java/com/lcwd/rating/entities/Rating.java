package com.lcwd.rating.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Rating_data")
public class Rating {

    @Id
    @Column
    private String ratingId;
    @Column
    private String userId;
    @Column
    private String hotelId;
    @Column
    private int rating;
    @Column
    private String feedback;
}
