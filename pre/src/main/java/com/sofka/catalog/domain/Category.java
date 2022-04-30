package com.sofka.catalog.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id", nullable = false)
    private Integer id;

    @Column(name = "cat_name", nullable = false, length = 80)
    private String catName;

    @Column(name = "cat_created_at", nullable = false)
    private Instant catCreatedAt;

    @OneToMany(mappedBy = "category")
    private Set<Subcategory> subcategories = new LinkedHashSet<>();


    public Set<Subcategory> getSubcategories() {
        return subcategories;
    }

}

