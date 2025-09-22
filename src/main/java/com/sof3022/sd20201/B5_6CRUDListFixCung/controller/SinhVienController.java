package com.sof3022.sd20201.B5_6CRUDListFixCung.controller;

import com.sof3022.sd20201.B5_6CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model m){
        // day list tu controller => html
        m.addAttribute("list1",sinhVienService.getList1());
        return "buoi4/sinh-viens";
    }

}
