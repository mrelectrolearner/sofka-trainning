package com.sofka.catalog.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "subcategory")
public class Subcategory {
    @EmbeddedId
    private SubcategoryId id;
    @MapsId("scatCategoryId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scat_category_id")
    private Category category;



    //TODO Reverse Engineering! Migrate other columns to the entity
}