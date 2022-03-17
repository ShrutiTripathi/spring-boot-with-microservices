package com.demo.ratingsdataservice.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserRatings {

    private List<Rating> userRatings;

}
