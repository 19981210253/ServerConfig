package com.zx.service;
import java.util.List;

import com.zx.client.ProductClientRibbon;
import com.zx.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 类名: ProductService
 * 作者:  ZX
 * 简介:
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();

    }
}