package com.sof3022.sd20201.B10_JPA.controller;

import com.sof3022.sd20201.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("hien-thi")
    public String hienThiDanhSachCate(Model m){
        m.addAttribute("listCate",categoryService.getAll());
        return "buoi10/index";
    }

}
