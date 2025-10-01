package com.sof3022.sd20201.B5_6CRUDListFixCung.controller;

import com.sof3022.sd20201.B5_6CRUDListFixCung.entity.SinhVien;
import com.sof3022.sd20201.B5_6CRUDListFixCung.service.SinhVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sinh-vien/")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("hien-thi")
    // /sinh-vien/sinh-vien/hien-thi
    public String hienThiDanhSachSinhVien(Model m){
        // day list tu controller => html
        m.addAttribute("list1",sinhVienService.getList1());
        return "buoi4/sinh-viens";
    }

    // @Pathvariable
    @GetMapping("delete/{ma1}")
    public String deleteSinhVien(@PathVariable("ma1") String ma){
        sinhVienService.xoaSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("detail/{ma}")
    public String detailSinhVien(@PathVariable String ma, Model m){
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        m.addAttribute("sv1",sv);
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("view-update/{ma}")
    public String viewUpdateSinhVien(@PathVariable String ma, Model m){
        SinhVien sv = sinhVienService.detailSinhVien(ma);
        m.addAttribute("sv1",sv);
        return "buoi4/update-sinh-vien";
    }

    @GetMapping("view-add")
    public String viewAddSinhVien(Model m){
        m.addAttribute("sv2",new SinhVien());
        return "buoi4/add-sinh-vien";
    }

    @PostMapping("add")
    public String addSinhVien(@Valid @ModelAttribute("sv2") SinhVien sv,
                              BindingResult result){
        if(result.hasErrors()){
            return "buoi4/add-sinh-vien";
        }
        sinhVienService.add(sv);
        return "redirect:/sinh-vien/hien-thi";
    }


    @ResponseBody
    @GetMapping("/lists")
    // localhost:8080/sinh-vien/lists
    public List<SinhVien>getAllSinhVien(){
        return sinhVienService.getList1();
    }
}
