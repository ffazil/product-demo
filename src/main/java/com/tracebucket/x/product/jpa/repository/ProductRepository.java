package com.tracebucket.x.product.jpa.repository;

import com.tracebucket.x.product.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
