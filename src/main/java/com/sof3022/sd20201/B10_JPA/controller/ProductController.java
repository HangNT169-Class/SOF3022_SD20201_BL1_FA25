package com.sof3022.sd20201.B10_JPA.controller;

import com.sof3022.sd20201.B10_JPA.service.CategoryService;
import com.sof3022.sd20201.B10_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/hien-thi")
    public String hienThiDanhSachSanPham(Model m){
        m.addAttribute("lists",productService.getAll());
        m.addAttribute("listCate",categoryService.getAll());
        return "buoi11/product";
    }

}
