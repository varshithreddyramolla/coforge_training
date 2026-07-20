package com.coforge.pms.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {

    private Map<Integer, Product> map = new HashMap<>();

    // INSERT
    public String createProduct(Product product) {

        if (map.containsKey(product.getPid()))
            return "Product ID already exists";

        if (product.getPname() == null || product.getPname().trim().isEmpty())
            return "Product Name cannot be empty";

        if (product.getPrice() <= 0)
            return "Product Price should be greater than zero";

        if (product.getQuantity() <= 0)
            return "Product Quantity should be greater than zero";

        map.put(product.getPid(), product);

        return "Product Inserted Successfully";
    }

    // UPDATE
    public String updateProduct(Product product) {

        if (!map.containsKey(product.getPid()))
            return "Product Not Found";

        if (product.getPname() == null || product.getPname().trim().isEmpty())
            return "Product Name cannot be empty";

        if (product.getPrice() <= 0)
            return "Product Price should be greater than zero";

        if (product.getQuantity() <= 0)
            return "Product Quantity should be greater than zero";

        map.put(product.getPid(), product);

        return "Product Updated Successfully";
    }

    // FIND
    public Product findProduct(int pid) {
        return map.get(pid);
    }

    // FIND ALL
    public Collection<Product> findAllProduct() {
        return map.values();
    }

    // DELETE
    public boolean deleteProduct(int pid) {

        if (map.containsKey(pid)) {
            map.remove(pid);
            return true;
        }

        return false;
    }

}