package com.BE.service;

import com.BE.model.entity.Tour;
import com.BE.model.request.TourDTO;

import java.util.List;

public interface TourService {
    Tour createTour(TourDTO tourDTO);
    List<Tour> read();
    Tour updateTour(int id, TourDTO tourDTO);
    void deleteTour(int id);
}
