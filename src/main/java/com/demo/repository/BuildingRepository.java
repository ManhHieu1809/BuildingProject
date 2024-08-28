package com.demo.repository;

import com.demo.repository.entity.BuildingEntity;

import java.util.ArrayList;
import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> findAll(String name,Long maxBuilding_area,Long minBuilding_area,Long rental_cost,String level,
                                 String payment,String manager_name,String direction);
}
