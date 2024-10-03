package com.BE.service;

import com.BE.model.entity.KoiFish;
import com.BE.model.request.KoiFishDTO;


import java.util.List;

public interface KoiFishService {
    KoiFish create(KoiFishDTO koiFishDTO);
    List<KoiFish> read(int id);
    KoiFish update(int id, KoiFishDTO koiFishDTO);
    void deleteKoiFish(int id);
}
