/*
 * @author Ramanujam Srinivasan
 * @created_on 04-24-2020
 */
package com.ramanujamrs.ecommerce.catalog.model;

import java.sql.Timestamp;


public class Catalog {

    private Long id;
    private String catalogName;
    private String catalogDescription;
    private String active;
    private Timestamp createdAt;
    private Timestamp modifiedAt;

    public Catalog(Long id, String catalogName, String catalogDescription, String active, Timestamp createdAt, Timestamp modifiedAt) {
        this.id = id;
        this.catalogName = catalogName;
        this.catalogDescription = catalogDescription;
        this.active = active;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogDescription() {
        return catalogDescription;
    }

    public void setCatalogDescription(String catalogDescription) {
        this.catalogDescription = catalogDescription;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}