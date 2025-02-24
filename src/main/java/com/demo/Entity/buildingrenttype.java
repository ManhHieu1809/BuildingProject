package com.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "buildingrenttype")
public class buildingrenttype {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
