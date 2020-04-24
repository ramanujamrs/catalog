/*
 * @author Ramanujam Srinivasan
 * @created_on 24-04-2020
 */
package com.ramanujamrs.ecommerce.catalog.service;

import com.ramanujamrs.ecommerce.catalog.model.Catalog;

import java.util.List;

public interface CatalogService
{
    List<Catalog> getCatalog();
}
