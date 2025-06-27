package com.example.demo.entity;

public class NhanVien {
    private long id;
    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien(long id, String maNV, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        this.id = id;
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if(maNV==null || maNV.isEmpty()){
            throw new IllegalArgumentException("MaNV can not be null or empty");
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten ==null || ten.isEmpty()){
            throw new IllegalArgumentException("Ten can not be null or empty");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi<20 || tuoi>60){
            throw new IllegalArgumentException("Tuoi between 20 and 60");
        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if(luong<1000000){
            throw new IllegalArgumentException("Luong higher than 1000000");
        }
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        if(soNamLamViec<1 || soNamLamViec>40){
            throw new IllegalArgumentException("SoNamLamViec between 1 and 40");
        }
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if(phongBan==null || phongBan.isEmpty()){
            throw new IllegalArgumentException("PhongBan can not be null or empty");
        }
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                ", soNamLamViec=" + soNamLamViec +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
