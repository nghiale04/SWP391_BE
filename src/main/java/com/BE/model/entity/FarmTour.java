package com.BE.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "farm_tour")
public class FarmTour {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
}
