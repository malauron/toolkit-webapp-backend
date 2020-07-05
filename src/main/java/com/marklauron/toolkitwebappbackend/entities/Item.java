package com.marklauron.toolkitwebappbackend.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="items")
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;
    private String itemName;
}
