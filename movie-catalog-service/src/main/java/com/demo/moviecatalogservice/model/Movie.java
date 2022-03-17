package com.demo.moviecatalogservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Movie {
    private String movieId;
    private String name;
}
