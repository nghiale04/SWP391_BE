package com.BE.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults (level = AccessLevel.PRIVATE)
@Entity
@Data
@Table (name = "koifish")
public class KoiFish {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;

    @Column (name = "KoiName",nullable = false)
    String koiName;

    @Column (name = "Detail",nullable = false)
    String detail;

    @Column (name = "Price",nullable = false)
    float price;
}
