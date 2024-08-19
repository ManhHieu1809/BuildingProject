package com.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String buildingName; // tên tòa nhà
    private String district; // quận
    private String ward; // phường
    private String street; // đường
    private String structure;
    private String basementNumber;
    private String floorArea; // diện tích sàn
    private String direction;
    private String ratings;
    private String leasedArea;
    private String rentCost;
    private String priceDescription;
    private String serviceFee; // phí dịch vụ
    private String carFee; // phí oto
    private String motobikeFee; // phí moto
    private String overtimeFee; // phí ngoài giờ
    private String electricityBill; // tiền điện
    private String deposit; // đặt cọc
    private String pay; // thanh toán
    private String rentalTerm; // thời hạn thuê
    private String decorationTime; // thời gian trang trí
    private String managerName; // tên quẩn lý
    private String mananagerPhoneNumber; // SDT quản lý
    private String brokerageFees; // phí môi giới
    private String buildingType; // loại tòa nhà
    private String note; // Ghi chú
}

