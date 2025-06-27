package com.example.demo.service;

import com.example.demo.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public void add(NhanVien nhanVien){
        if (nhanVien == null){
            throw new IllegalArgumentException("Nhan vien can not be null");
        }
        listNhanVien.add(nhanVien);
    }
    public List<NhanVien> getAll(){
        return new ArrayList<>(listNhanVien);
    }
}
