package com.sofka.catalog.domain;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SubcategoryId implements Serializable {
    private static final long serialVersionUID = -5499842808207262022L;
    @Column(name = "scat_id", nullable = false)
    private Integer scatId;
    @Column(name = "scat_category_id", nullable = false)
    private Integer scatCategoryId;


}