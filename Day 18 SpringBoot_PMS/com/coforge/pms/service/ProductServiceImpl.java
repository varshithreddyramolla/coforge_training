package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepo repo;
	private Environment environment;

	@Autowired
	public ProductServiceImpl(ProductRepo productRepo, Environment environment) {
		super();
		this.repo = productRepo;
		this.environment = environment;
	}

	@Override
	public boolean saveProduct(Product product) {
		repo.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(int productId, Product product) {
		if (!repo.existsById(productId))
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		repo.save(product);
		return true;
	}

	@Override
	public boolean deleteProductById(int productId) {

		if (!repo.existsById(productId))
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		repo.deleteById(productId);
		return true;
	}

	@Override
	public Optional<Product> findByPid(int productId) {
		if (!repo.existsById(productId)) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		Optional<Product> product = repo.findById(productId);
		return product;
	}

	@Override
	public Iterable<Product> findAllProducts() {
		return repo.findAll();
	}

	@Override
	public List<Product> findByproductName(String productName) {
		
		List<Product> products = repo.findByPname(productName);
		if (products.isEmpty())
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		return products;
	}

	@Override
	@Transactional
	public boolean deleteByProductName(String productName) {
		
		int n = repo.deleteByPname(productName);
		if (n == 0) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return true;
	}

	
	@Override
	public String getInfo() {
		return repo.getInfo();
	}
}