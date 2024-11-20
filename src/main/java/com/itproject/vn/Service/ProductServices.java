package com.itproject.vn.Service;

import java.util.List;

import com.itproject.vn.Entity.Product;

public interface ProductServices {
	void delete(Long id);

	Product get(Long id);

	Product save(Product product);

	List<Product> listAll();
}
