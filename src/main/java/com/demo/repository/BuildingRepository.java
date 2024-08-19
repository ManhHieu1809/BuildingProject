package com.demo.repository;

import com.demo.repository.entity.BuildingEntity;

import java.util.ArrayList;
import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> findAll(String name,Long ward_id);
}
