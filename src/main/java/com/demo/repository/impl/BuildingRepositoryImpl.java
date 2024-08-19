package com.demo.repository.impl;

import com.demo.repository.BuildingRepository;
import com.demo.repository.entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

    static final String DB_URL = "jdbc:mysql://localhost:3306/buildingmanager";
    static final String USER = "root";
    static final String PASS = "";
    @Override
    public List<BuildingEntity> findAll(String name,Long ward_id) {
        StringBuilder sql = new StringBuilder("SELECT * FROM building where 1=1");

        if(name != null && !name.equals(" ")){
            sql.append(" AND name LIKE '%" + name + "%'");

        }

        if(ward_id != null){
           sql.append(" and ward_id = "+ward_id);
        }

        List<BuildingEntity> result = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS)){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql.toString());
            while(rs.next()){
                BuildingEntity buildingEntity = new BuildingEntity();
                buildingEntity.setName(rs.getString("name"));
                buildingEntity.setNumber_of_basement(rs.getInt("number_of_basement"));
                buildingEntity.setStructure(rs.getString("structure"));
                buildingEntity.setStreet(rs.getString("street"));
                result.add(buildingEntity);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }


}
