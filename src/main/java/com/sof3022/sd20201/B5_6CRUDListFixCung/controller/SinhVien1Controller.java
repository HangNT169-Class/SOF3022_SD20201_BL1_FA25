package com.sof3022.sd20201.B5_6CRUDListFixCung.controller;

import com.sof3022.sd20201.B5_6CRUDListFixCung.entity.SinhVien;
import com.sof3022.sd20201.B5_6CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SinhVien1Controller {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/a")
    public String test(){
        return "buoi4/sinh-viens";
    }

    @GetMapping("/lists")
    public List<SinhVien> getAllSinhVien(){
        return sinhVienService.getList1();
    }

}
