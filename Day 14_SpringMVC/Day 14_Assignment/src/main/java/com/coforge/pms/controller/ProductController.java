package com.coforge.pms.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("home")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductHome");

        return mv;
    }

    @RequestMapping(value = "product", method = RequestMethod.POST, params = "Insert")
    public ModelAndView insertProduct(@ModelAttribute Product product) {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("ProductHome");

        String result = service.createProduct(product);
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping(value = "product", method = RequestMethod.POST, params = "Update")
    public ModelAndView updateProduct(@ModelAttribute Product product) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductHome");
        String result = service.updateProduct(product);
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping(value = "product", method = RequestMethod.POST, params = "Find")
    public ModelAndView findProduct(@RequestParam int pid) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductHome");
        Product product = service.findProduct(pid);
        if (product != null)
            mv.addObject("result", product);
        else
            mv.addObject("result", "Product Not Found");

        return mv;
    }

    @RequestMapping(value = "product", method = RequestMethod.POST, params = "FindAll")
    public ModelAndView findAllProduct() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductHome");
        Collection<Product> products = service.findAllProduct();
        mv.addObject("result", products);

        return mv;
    }

    @RequestMapping(value = "product", method = RequestMethod.POST, params = "Delete")
    public ModelAndView deleteProduct(@RequestParam int pid) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ProductHome");
        boolean status = service.deleteProduct(pid);

        if (status)
            mv.addObject("result", "Product Deleted Successfully");
        else
            mv.addObject("result", "Product Not Found");

        return mv;
    }

}