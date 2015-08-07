package com.tracebucket.x.product;

import com.tracebucket.x.product.domain.Product;
import com.tracebucket.x.product.jpa.repository.ProductRepository;
import com.tracebucket.x.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProductDemoApplication.class)
@WebAppConfiguration
public class ProductDemoApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

	@Test
	public void contextLoads() {
	}

	@Test
    public void testCreateProduct(){
        Product iphone = new Product(4L, "Apple IPhone", new BigDecimal(299.99),"Smart phone");

        iphone = productService.newProduct(iphone);
        Assert.assertNotNull(iphone.getId());
    }

}
