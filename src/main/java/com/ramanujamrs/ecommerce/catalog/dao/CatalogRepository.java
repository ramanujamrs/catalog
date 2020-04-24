/*
 * @author Ramanujam Srinivasan
 * @created_on 24-04-2020
 */
package com.ramanujamrs.ecommerce.catalog.dao;

import com.ramanujamrs.ecommerce.catalog.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository <Catalog, Long>
{

}
