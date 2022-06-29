/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.service;

import com.mycompany.springwebshop.entity.ProductEntity;
import com.mycompany.springwebshop.model.ProductDTO;
import com.mycompany.springwebshop.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<ProductDTO> getProducts(){
    	List<ProductDTO> productList=new ArrayList<ProductDTO>();
    	List<ProductEntity> productEntityList=(List<ProductEntity>) productRepository.findAll();
    	for (ProductEntity product: productEntityList)
    		productList.add(new ProductDTO(product));
        return productList;
    }
    public ProductDTO getProductByID(Long id){
        return new ProductDTO(productRepository.findById(id).orElse(null));
    }
}
