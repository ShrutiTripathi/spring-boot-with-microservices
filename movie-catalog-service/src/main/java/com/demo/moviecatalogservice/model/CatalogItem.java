package com.demo.moviecatalogservice.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CatalogItem {
   private String name;
    private String desc;
    private int ratings;
}
