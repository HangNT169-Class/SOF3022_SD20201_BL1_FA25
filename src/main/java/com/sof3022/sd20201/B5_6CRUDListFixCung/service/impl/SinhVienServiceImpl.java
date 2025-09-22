package com.sof3022.sd20201.B5_6CRUDListFixCung.service.impl;

import com.sof3022.sd20201.B5_6CRUDListFixCung.entity.SinhVien;
import com.sof3022.sd20201.B5_6CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    // Load du lieu len table
    private List<SinhVien>listSinhVien = new ArrayList<>();
    // C1: Static
    // C2: khoi tao trong constructor
    public SinhVienServiceImpl(){
        // add phan tu vao list
        listSinhVien.add(new SinhVien("sv01","Tung",18,"Hn",true));
        listSinhVien.add(new SinhVien("sv02","Ngoc",18,"St",false));
        listSinhVien.add(new SinhVien("sv03","Skibidi",20,"ThanhHoa",true));
        listSinhVien.add(new SinhVien("sv04","gafg",11,"Thanh tri",false));
        listSinhVien.add(new SinhVien("sv05","gdfg",10,"Ngoc hoi",false));
    }

    @Override
    public List<SinhVien> getList1() {
        return listSinhVien;
    }

    @Override
    public SinhVien detail(String id) {
        return null;
    }

}
