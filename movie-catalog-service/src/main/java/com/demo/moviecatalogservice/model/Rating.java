package com.demo.moviecatalogservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Rating {
    String movieId;
    int ratings;
}
