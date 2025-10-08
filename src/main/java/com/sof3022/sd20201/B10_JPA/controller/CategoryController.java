package com.sof3022.sd20201.B10_JPA.controller;

import com.sof3022.sd20201.B10_JPA.entity.Category1;
import com.sof3022.sd20201.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @ResponseBody
    @GetMapping("phan-trang")
    public List<Category1>phanTrang(@RequestParam("pageNo1")Integer pageNo,
                                    @RequestParam("pageSize")Integer pageSize){
        return categoryService.phanTrang(pageNo,pageSize).getContent();
    }
}
