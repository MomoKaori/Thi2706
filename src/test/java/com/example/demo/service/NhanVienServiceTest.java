package com.example.demo.service;

import com.example.demo.entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService nhanVienService;
    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    void addWithValidValue() {
        NhanVien nhanVien = new NhanVien(1,"NV1","NVA",23,5000000,1,"QuanLy");
        nhanVienService.add(nhanVien);
        assertEquals(1,nhanVienService.getAll().size());
    }
    @Test
    void addWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,()->nhanVienService.add(null));

        assertEquals("Nhan vien can not be null",exception.getMessage());
    }

    @Test
    void addWithInvalidMa() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->nhanVienService.add(new NhanVien(1,"","NVA",23,5000000,1,"QuanLy")));

        assertEquals("MaNV can not be null or empty",exception.getMessage());
    }
    @Test
    void addWithInvalidTen() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->nhanVienService.add(new NhanVien(1,"NV1","",23,5000000,1,"QuanLy")));

        assertEquals("Ten can not be null or empty",exception.getMessage());
    }
    @Test
    void addWithWrongTuoi() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->nhanVienService.add(new NhanVien(1,"NV1","NVA",1,5000000,1,"QuanLy")));

        assertEquals("Tuoi between 20 and 60",exception.getMessage());
    }
    @Test
    void addWithWrongLuong() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->nhanVienService.add(new NhanVien(1,"NV1","NVA",23,5,1,"QuanLy")));

        assertEquals("Luong higher than 1000000",exception.getMessage());
    }
    @Test
    void addWithWrongSoNamLamViec() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->nhanVienService.add(new NhanVien(1,"NV1","NVA",23,5000000,60,"QuanLy")));

        assertEquals("SoNamLamViec between 1 and 40",exception.getMessage());
    }

    @Test
    void addWithWrongPhongBan() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->nhanVienService.add(new NhanVien(1,"NV1","NVA",23,5000000,1,"")));

        assertEquals("PhongBan can not be null or empty",exception.getMessage());
    }
}