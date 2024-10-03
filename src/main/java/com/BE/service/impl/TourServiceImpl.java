package com.BE.service.impl;

import com.BE.model.entity.Tour;
import com.BE.model.request.TourDTO;
import com.BE.model.response.TourResponseDTO;
import com.BE.repository.TourRepository;
import com.BE.service.TourService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {
    @Autowired
    TourRepository tourRepository;

    @Override
    public Tour createTour(TourDTO tourDTO) {
        Tour newTour = new Tour();
        newTour.setTourName(tourDTO.getName());
        newTour.setTourDate(tourDTO.getDate());
        newTour.setTourPrice(tourDTO.getPrice());
        newTour.setTourDuration(tourDTO.getDuration());
        return tourRepository.save(newTour);
    }

    @Override
    public List<Tour> read() {
        return tourRepository.findAll();
    }

    @Override
    public Tour updateTour(int id, TourDTO tourDTO) {
        Optional<Tour> optionalTour = tourRepository.findById(id);
        if (optionalTour!= null) throw new EntityNotFoundException();
        Tour tour = optionalTour.get();
        tour.setTourName(tour.getTourName());
        tour.setTourDate(tour.getTourDate());
        tour.setTourPrice(tour.getTourPrice());
        tour.setTourDuration(tour.getTourDuration());
        return tourRepository.save(tour);
    }

    @Override
    public void deleteTour(int id) {
        Optional<Tour> tour = tourRepository.findById(id);
        if (tour != null) throw new EntityNotFoundException();
        tourRepository.deleteById(id);
    }
}
