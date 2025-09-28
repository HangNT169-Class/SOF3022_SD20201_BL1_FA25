package com.sof3022.sd20201.B5_6CRUDListFixCung.controller;

import com.sof3022.sd20201.B5_6CRUDListFixCung.entity.SinhVien;
import com.sof3022.sd20201.B5_6CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    // @Pathvariable
    @GetMapping("sinh-vien/delete/{ma1}")
    public String deleteSinhVien(@PathVariable("ma1") String ma){
        sinhVienService.xoaSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("sinh-vien/detail/{ma}")
    public String detailSinhVien(@PathVariable String ma, Model m){
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        m.addAttribute("sv1",sv);
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("sinh-vien/view-update/{ma}")
    public String viewUpdateSinhVien(@PathVariable String ma, Model m){
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        m.addAttribute("sv1",sv);
        return "buoi4/update-sinh-vien";
    }

}
