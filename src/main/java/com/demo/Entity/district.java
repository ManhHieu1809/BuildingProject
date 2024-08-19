package com.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "district")
public class district{
    @Id
    private String id;
    @Column(name = "code")
    private String code;
    @Column( name = "name")
    private String name;
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
