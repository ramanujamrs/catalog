/*
 * @author Ramanujam Srinivasan
 * @created_on 24-04-2020
 */
package com.ramanujamrs.ecommerce.catalog.service;

import com.ramanujamrs.ecommerce.catalog.dao.CatalogRepository;
import com.ramanujamrs.ecommerce.catalog.model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("catalogService")
public class CatalogServiceImpl implements CatalogService
{

    @Autowired
    private CatalogRepository catalogRepository;

    @Override
    public List<Catalog> getCatalog() {
        List<Catalog> catalogList = catalogRepository.findAll();
        return catalogList;
    }
}
