package com.BE.service.impl;

import com.BE.model.entity.KoiFish;
import com.BE.model.request.KoiFishDTO;
import com.BE.repository.KoiFishRepository;
import com.BE.service.KoiFishService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KoiFishServiceImpl implements KoiFishService {
    @Autowired
    KoiFishRepository koiFishRepository;

    @Override
    public KoiFish create(KoiFishDTO koiFishDTO) {
        KoiFish newKoiFish = new KoiFish();
        // Convert FarmDTO to Farm entity
        newKoiFish.setKoiName(koiFishDTO.getKoiname());
        newKoiFish.setDetail(koiFishDTO.getDetail());
        newKoiFish.setPrice(koiFishDTO.getPrice());
        return koiFishRepository.save(newKoiFish);
    }

    @Override
    public List<KoiFish> read(int id) {
        return koiFishRepository.findAll();
    }

    @Override
    public KoiFish update(int id, KoiFishDTO koiFishDTO) {
        Optional<KoiFish> optionalKoiFish = koiFishRepository.findById(id);
        if (optionalKoiFish!= null) throw new EntityNotFoundException();
        KoiFish koiFish = optionalKoiFish.get();
        koiFish.setKoiName(koiFish.getKoiName());
        koiFish.setDetail(koiFish.getDetail());
        koiFish.setPrice(koiFish.getPrice());
        return koiFishRepository.save(koiFish);
    }

    @Override
    public void deleteKoiFish(int id) {
        Optional<KoiFish> oldKoiFish = koiFishRepository.findById(id);
        if (oldKoiFish != null) throw new EntityNotFoundException();
        koiFishRepository.deleteById(id);
    }
}
