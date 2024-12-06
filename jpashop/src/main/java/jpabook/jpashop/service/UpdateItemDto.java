package jpabook.jpashop.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateItemDto {
    Long id;
    String name;
    int price;
    int stockQuantity;
}
