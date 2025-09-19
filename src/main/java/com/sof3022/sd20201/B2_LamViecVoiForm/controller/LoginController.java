package com.sof3022.sd20201.B2_LamViecVoiForm.controller;

import com.sof3022.sd20201.B2_LamViecVoiForm.request.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// Bean => Khi chay chuong trinh => co bn bean se duoc khoi tao luon
// Tang controller => danh dau bean:
// C1: @Controller
// C2: @RestController
@Controller
public class LoginController {
    // BE <=> FE(thymeaft)
    // http method:  CRUD
    // GET: lay, hien thi du lieu <=> READ <=> SELECT
    // POST: add <=> CREATE
    // PUT : update
    // DELETE: delete
    // 2 phuong thuc: GET: lay, hien thi du lieu  & POST: xu ly form
    // @Controller:
    // TAT CA CAC HAM TRONG CLASS : @CONTROLLER
    // => LUON LUON RETURN 1 STRING(TRA VE 1 VIEW)

    // Spring Web
    @GetMapping("login")
//    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String hienThiFormLogin() {
        return "buoi1/login-form"; // view muon hien thi
    }

//    @PostMapping("ket-qua")
////    @RequestMapping(value = "ket-qua",method = RequestMethod.POST)
//    public String xuLyForm(
//            @RequestParam("uname") String username1,
//            @RequestParam("pass") String password, Model m
//    ){
//        // B1: Lay du lieu vua nhap tren form
//        // Lay du lieu tu html => java
//        // getParameter("name")
//        // J5: @RequestParam
//        // B2: Chuyen gia tri sang giao dien => setAttribute
//        // J5: Model  ham addAttribute
//        m.addAttribute("u1",username1);
//        m.addAttribute("p1",password);
//        return "buoi1/ket-qua";
//        }
//    }
    @PostMapping("ket-qua")
    public String xuLyForm(
            LoginRequest request, Model m
    ){
        m.addAttribute("u1",request.getUname());
        m.addAttribute("p1",request.getPass());
        return "buoi1/ket-qua";
    }

}