package com.sof3022.sd20201.B5_6CRUDListFixCung.service;

import com.sof3022.sd20201.B5_6CRUDListFixCung.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    // Liet ke cac ham chung ta co the dung tai day
    // trong interface:
    // se chua cac ham chi chua ten ham k chua body code
    // cac ham luon luon la public
    // tinh da hinh: OOP
    List<SinhVien> getList1();

    SinhVien detail(String id);

    void add(SinhVien sv);

    void xoaSinhVien(String mssv);

    SinhVien detailSinhVien(String mssv);

    void updateSinhVien(String mssv, SinhVien updateSinhVien);


}
