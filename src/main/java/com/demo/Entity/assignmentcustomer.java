package com.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "assignmentcustomer")
public class assignmentcustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "customername")
    private String customername;
    @Column(name = "customeraddress")
    private String customeraddress;
    @Column(name = "customerphone")
    private String customerphone;
    @Column(name = "customeremail")
    private String customeremail;
    @Column(name = "customergender")
    private String customergender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public String getCustomergender() {
        return customergender;
    }

    public void setCustomergender(String customergender) {
        this.customergender = customergender;
    }
}
