package com.demo.model;

public class BuildingDTO {
    private String name;
    private Long maxBuilding_area;
    private Long minBuilding_area;
    private Long rental_cost;
    private String level;
    private String payment;
    private String manager_name;
    private String manager_phone;
    private String direction;
    private String cost_description;
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

    public Long getMaxBuilding_area() {
        return maxBuilding_area;
    }

    public void setMaxBuilding_area(Long maxBuilding_area) {
        this.maxBuilding_area = maxBuilding_area;
    }

    public Long getMinBuilding_area() {
        return minBuilding_area;
    }

    public void setMinBuilding_area(Long minBuilding_area) {
        this.minBuilding_area = minBuilding_area;
    }

    public Long getRental_cost() {
        return rental_cost;
    }

    public void setRental_cost(Long rental_cost) {
        this.rental_cost = rental_cost;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_phone() {
        return manager_phone;
    }

    public void setManager_phone(String manager_phone) {
        this.manager_phone = manager_phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCost_description() {
        return cost_description;
    }

    public void setCost_description(String cost_description) {
        this.cost_description = cost_description;
    }
}
