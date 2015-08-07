package com.tracebucket.x.product.service.impl;

import com.gemstone.gemfire.cache.Region;
import com.tracebucket.x.product.domain.Product;
import com.tracebucket.x.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author ffazil
 * @since 07/08/15
 */

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Product findOne(Long id) {
        return null;
    }

    @Override
    public Product newProduct(Product product) {
        Region<Long, Product> region = applicationContext.getBean(Region.class);


        region.put(product.getId(), product);
        product = region.get(product.getId());
        return product;
    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
