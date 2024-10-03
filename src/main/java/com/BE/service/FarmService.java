package com.BE.service;

import com.BE.model.entity.Farm;
import com.BE.model.request.FarmDTO;
import com.SWP391_Project.Entity.Farm;
import com.SWP391_Project.model.FarmDTO;

import java.util.List;

public interface FarmService {
     Farm create(FarmDTO farmDTO);
     List<Farm> read();
     Farm update(int id, FarmDTO farmDTO);
     void deleteFarm(int id);
}
