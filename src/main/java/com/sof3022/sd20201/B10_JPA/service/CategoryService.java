package com.sof3022.sd20201.B10_JPA.service;

import com.sof3022.sd20201.B10_JPA.entity.Category1;
import com.sof3022.sd20201.B10_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    // goi repository
    @Autowired
    private CategoryRepository cateRepostiory;

    public List<Category1>getAll(){
        return cateRepostiory.findAll(); // get All
    }

    public Category1 detailCate(Long id){
        return cateRepostiory.findById(id).get();
    }

    public void addOrUpdate(Category1 cate){
        cateRepostiory.save(cate);
    }

    public void removeCate(Long id){
//        cateRepostiory.delete(cate);
        cateRepostiory.deleteById(id);
    }
    public List<Category1>search1(Long id, String name){
        return cateRepostiory.timKiemTheoTenVaId(name,id);
    }

}
