package com.springmvc.demo.controller;

import com.springmvc.demo.models.Category;
import com.springmvc.demo.models.Product;
import com.springmvc.demo.repositories.CategoryRepository;
import com.springmvc.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "products")
public class ProductController {
    @Autowired
    ProductRepository productRepository;
    // http:localhost:8083/products/getProductsByCategoryID/C0103
    @RequestMapping(value = "/getProductsByCategoryID/{categoryID}", method = RequestMethod.GET)
    public String getProductsByCategoryID(ModelMap modelMap, @PathVariable String categoryID) {
        Iterable<Product> products = productRepository.findByCategoryID(categoryID);
        modelMap.addAttribute("products", products);
        return "productList"; //"productList.jsp"
    }
}
