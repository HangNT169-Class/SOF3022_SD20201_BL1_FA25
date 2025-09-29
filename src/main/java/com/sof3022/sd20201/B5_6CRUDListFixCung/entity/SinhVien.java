package com.sof3022.sd20201.B5_6CRUDListFixCung.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    // cac loai kieu du lieuj
    // String => @NotBlank/NotEmpty
    // Khac => @NotNull
    @NotBlank
//    @Pattern(regexp = "\\d+",message = "MSSV k dung dinh dang")
//    @Size(min = 5,message = "Vuot qua khoang cho phep") // do dai cua chuoi
    private String mssv;

    @NotEmpty(message = "Ten khong duoc de trong")
    private String ten;

    // https://viblo.asia/p/dung-validation-bang-tay-trong-spring-boot-phan-1-3P0lPGyoZox
    @NotNull(message = "Tuoi khong duoc de trong")
//    @Min(value = 18,message = "Tuoi ngoai khoang cho phep")
//    @Max(value = 35,message = "Tuoi ngoai khoang cho phep")
    private Integer tuoi;

    private String diaChi;

    @NotNull(message = "Gioi tinh khong duoc de trong")
    private Boolean gioiTinh;

}
