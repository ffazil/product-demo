package com.tracebucket.x.product.service;

import com.tracebucket.x.product.domain.Product;

/**
 * @author ffazil
 * @since 07/08/15
 */
public interface ProductService {
    public Product findOne(Long id);
    public Product newProduct(Product product);
    public Product update(Product product);
}
