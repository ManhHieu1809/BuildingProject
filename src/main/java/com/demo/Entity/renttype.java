package com.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "renttype")
public class renttype {
    @Id
    @GeneratedValue
    private int id;
}
