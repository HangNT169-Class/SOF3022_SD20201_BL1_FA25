package com.sof3022.sd20201.B10_JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    // 1 Cate -> N Product
    // 1 Product -> 1 Cate
//    category_id
    // ManyToOne:
    // OneToMany:
//    ManyToMany
    @ManyToOne
    // name: la ten cua cot giong column, referencedColumnName: noi vs cot khoa ngoai ten la gi
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category1 cate;
}
