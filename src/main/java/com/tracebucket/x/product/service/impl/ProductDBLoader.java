package com.tracebucket.x.product.service.impl;

import com.gemstone.gemfire.cache.CacheLoader;
import com.gemstone.gemfire.cache.CacheLoaderException;
import com.gemstone.gemfire.cache.LoaderHelper;
import com.tracebucket.x.product.domain.Product;
import com.tracebucket.x.product.jpa.repository.ProductRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A cache loader that loads Product entries from a backing store using a Spring Data Repository
 */
@Component
public class ProductDBLoader implements CacheLoader<Long, Product> {
	@Autowired
	private ProductRepository productRepository;
	
	private static Log log = LogFactory.getLog(ProductDBLoader.class);
	
	/* (non-Javadoc)
	 * @see com.gemstone.gemfire.cache.CacheCallback#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gemstone.gemfire.cache.CacheLoader#load(com.gemstone.gemfire.cache.LoaderHelper)
	 */
	@Override
	public Product load(LoaderHelper<Long, Product> loadHelper) throws CacheLoaderException {
		Long id = Long.parseLong(String.valueOf(loadHelper.getKey()));
		log.debug("loading product id " + id + " from the database");
		return productRepository.findOne(id);
	}
}
