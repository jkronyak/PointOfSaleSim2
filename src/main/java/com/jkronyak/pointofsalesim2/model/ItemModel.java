package com.jkronyak.pointofsalesim2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ItemModel {

    @Id
    private Long itemId;

    @Column(name = "name")
    private String name;

    @Column(name = "weighted")
    private Boolean weighted;

    @Column(name = "price")
    private Double price;


}

