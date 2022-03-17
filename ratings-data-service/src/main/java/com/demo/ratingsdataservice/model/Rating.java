package com.demo.ratingsdataservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Rating {
    String movieId;
    int ratings;
}
