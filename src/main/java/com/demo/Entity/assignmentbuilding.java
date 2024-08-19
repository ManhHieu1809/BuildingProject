package com.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "assignmentbuilding")
public class assignmentbuilding {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "buildingname")
    private String buildingname;
    @Column(name = "buildingtype")
    private String buildingtype;
    @Column(name = "buildinglocation")
    private String buildinglocation;
    @Column(name = "buildingaddress")
    private String buildingaddress;
    @Column(name = "buildingphone")
    private String buildingphone;
    @Column(name = "buildingemail")
    private String buildingemail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getBuildingtype() {
        return buildingtype;
    }

    public void setBuildingtype(String buildingtype) {
        this.buildingtype = buildingtype;
    }

    public String getBuildinglocation() {
        return buildinglocation;
    }

    public void setBuildinglocation(String buildinglocation) {
        this.buildinglocation = buildinglocation;
    }

    public String getBuildingaddress() {
        return buildingaddress;
    }

    public void setBuildingaddress(String buildingaddress) {
        this.buildingaddress = buildingaddress;
    }

    public String getBuildingphone() {
        return buildingphone;
    }

    public void setBuildingphone(String buildingphone) {
        this.buildingphone = buildingphone;
    }

    public String getBuildingemail() {
        return buildingemail;
    }

    public void setBuildingemail(String buildingemail) {
        this.buildingemail = buildingemail;
    }
}
