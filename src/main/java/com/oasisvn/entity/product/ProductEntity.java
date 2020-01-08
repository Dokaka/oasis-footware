package com.oasisvn.entity.product;

import com.oasisvn.entity.BaseEntity;
import com.oasisvn.entity.category.CategoryEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "product")
public class ProductEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -2222593543117030062L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable   = false, name = "sub_title")
    private String subTitle;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false, name = "unit_cost")
    private double unitCost;

    @Column(nullable = false, name = "unit_price")
    private double unitPrice;

    @Column(nullable = false, length = 6)
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity category;

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ProductImageEntity> images = new ArrayList<>();

}