package com.sof3022.sd20201.B10_JPA.repository;

import com.sof3022.sd20201.B10_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category1,Long> {
    // CRUD trong 1 bang khong can phan viet
    // Tu tim Query creation

    @Query("SELECT c FROM Category1 c WHERE c.id = ?2 AND c.categoryName = ?1")
    List<Category1>timKiemTheoTenVaId(String name,Long id);

    @Query("SELECT c FROM Category1 c WHERE c.id =:id1 AND c.categoryName =:name")
    List<Category1>timKiemTheoTenVaId1(@Param("name") String name1, @Param("id1") Long id);

}
