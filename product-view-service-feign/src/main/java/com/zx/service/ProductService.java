package com.zx.service;

import com.zx.client.ProductClientFeign;
import com.zx.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名: ProductService
 * 作者:  ZX
 * 简介:
 */
@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();

    }
}