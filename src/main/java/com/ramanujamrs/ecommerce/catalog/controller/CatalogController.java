/*
 * @author Ramanujam Srinivasan
 * @created_on 04-24-2020
 */

package com.ramanujamrs.ecommerce.catalog.controller;

import com.ramanujamrs.ecommerce.catalog.model.Catalog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/catalog")
public class CatalogController {

    @GetMapping("/all")
    public List<Catalog> getCatalog()
    {
        List<Catalog> catalogList = new ArrayList<>();

        Timestamp dummytimestamp = new Timestamp(System.currentTimeMillis());
        Catalog cat1 = new Catalog(1L, "Back to School", "Back to School specific Catalog", "Y", dummytimestamp, dummytimestamp);
        catalogList.add(cat1);

        return catalogList;
    }
}
