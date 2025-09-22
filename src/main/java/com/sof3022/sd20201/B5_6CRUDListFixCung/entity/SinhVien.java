package com.sof3022.sd20201.B5_6CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
//    Tạo đối tượng SinhVien gồm các thuộc tính: mssv - String, ten-String,
//    tuoi- int, diaChi - String, gioiTinh - boolean và các constructor,
//    getter, setter

    private String mssv;

    private String ten;

    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

}
