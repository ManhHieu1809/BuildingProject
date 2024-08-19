package com.demo.repository.entity;

public class BuildingEntity {
    private String name;
    private Integer number_of_basement;
    private String structure;
    private String street;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber_of_basement() {
        return number_of_basement;
    }

    public void setNumber_of_basement(Integer number_of_basement) {
        this.number_of_basement = number_of_basement;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
