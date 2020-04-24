/*
 * @author Ramanujam Srinivasan
 * @created_on 04-24-2020
 */

package com.ramanujamrs.ecommerce.catalog.controller;

import com.ramanujamrs.ecommerce.catalog.model.Catalog;
import com.ramanujamrs.ecommerce.catalog.service.CatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/catalog")
public class CatalogController {
    @Resource(name="catalogService")
    private CatalogService catalogService;

    @GetMapping("/all")
    public List<Catalog> getCatalog()
    {
        List<Catalog> catalogList = new ArrayList<>();
        catalogList = catalogService.getCatalog();
        return catalogList;
    }
}
