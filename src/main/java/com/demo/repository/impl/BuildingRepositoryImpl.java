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
    public List<BuildingEntity> findAll(String name,Long maxBuilding_area,Long minBuilding_area,Long rental_cost,String level,
                                        String payment,String manager_name,String direction) {
        StringBuilder sql = new StringBuilder("SELECT * FROM building where 1=1");

        if(name != null && !name.equals(" ")){
            sql.append(" AND name LIKE '%" + name + "%'");

        }

        if(minBuilding_area != null ){
            sql.append(" AND building_area > " + minBuilding_area);
        }

        if(maxBuilding_area != null ){
            sql.append(" AND building_area < " + maxBuilding_area);
        }

        if(rental_cost != null ){
            sql.append(" AND rental_cost " + rental_cost + " > " + 5000000);
        }

        if(level != null && !level.equals(" ")){
            sql.append(" AND level LIKE '%" + level + "%'");
        }

        if(payment != null && !payment.equals(" ")){
            sql.append(" AND payment LIKE '%" + payment + "%'");
        }

        if(manager_name != null && !manager_name.equals(" ")){
            sql.append(" AND manager_name LIKE '%" + manager_name + "%'");
        }

        if(direction != null && !direction.equals(" ")){
            sql.append(" AND direction LIKE '%" + direction + "%'");
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
                buildingEntity.setMaxBuilding_area(rs.getLong("building_area"));
                buildingEntity.setMinBuilding_area(rs.getLong("building_area"));
                buildingEntity.setRental_cost(rs.getLong("rental_cost"));
                buildingEntity.setLevel(rs.getString("level"));
                buildingEntity.setPayment(rs.getString("payment"));
                buildingEntity.setManager_name(rs.getString("manager_name"));
                buildingEntity.setManager_phone(rs.getString("manager_phone"));
                buildingEntity.setDirection(rs.getString("direction"));
                buildingEntity.setCost_description(rs.getString("cost_description"));
                result.add(buildingEntity);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }


}
