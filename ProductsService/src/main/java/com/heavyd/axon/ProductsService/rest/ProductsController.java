package com.heavyd.axon.ProductsService.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController
{
    @PostMapping
    public String createProduct()
    {
        return "HTTP POST IS HANDLED";
    }

    @GetMapping
    public String getProduct()
    {
        return "GET IS HANDLED";
    }

    @DeleteMapping
    public String deleteProduct()
    {
        return "DELETE is handled";
    }

    @PutMapping
    public String updateProduct()
    {
        return "UPDATE IS HANDLED";
    }
}
