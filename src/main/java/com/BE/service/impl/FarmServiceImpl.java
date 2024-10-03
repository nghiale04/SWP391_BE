package com.BE.service.impl;

import com.BE.model.entity.Farm;
import com.BE.model.request.FarmDTO;
import com.BE.repository.FarmRepository;
import com.BE.service.FarmService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmServiceImpl implements FarmService {


    @Autowired
    FarmRepository farmRepository;

    @Override
    public Farm create(FarmDTO farmDTO) {
        Farm newFarm = new Farm();
        // Convert FarmDTO to Farm entity
        newFarm.setFarmName(farmDTO.getFarmName());
        newFarm.setDescription(farmDTO.getDescription());
        newFarm.setLocation(farmDTO.getLocation());
        newFarm.setStartTime(farmDTO.getStartTime());
        newFarm.setEndTime(farmDTO.getEndTime());
        return farmRepository.save(newFarm);
    }
    @Override
    public List<Farm> read() {
        return farmRepository.findAll();
    }

    @Override
    public Farm update(int id, FarmDTO farm) {
        Optional<Farm> optionalFarm = farmRepository.findById(id);
        if (optionalFarm == null) {throw new EntityNotFoundException();}
        Farm oldFarm = optionalFarm.get();
        oldFarm.setFarmName(farm.getFarmName());
        oldFarm.setDescription(farm.getDescription());
        oldFarm.setLocation(farm.getLocation());
        oldFarm.setStartTime(farm.getStartTime());
        oldFarm.setEndTime(farm.getEndTime());
        return farmRepository.save(oldFarm);
    }

    @Override
    public void deleteFarm(int id) {
        Optional<Farm> oldFarm = farmRepository.findById(id);
        if (oldFarm == null) throw new EntityNotFoundException();
        farmRepository.deleteById(id);
    }
}
