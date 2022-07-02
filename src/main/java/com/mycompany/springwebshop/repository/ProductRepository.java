/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.repository;


import com.mycompany.springwebshop.entity.ProductEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long>{
    @Query("SELECT p FROM ProductEntity p JOIN FETCH p.itemcartList WHERE p.id = (:id)")
    ProductEntity findByIdAndFetchItemcartListEager(@Param("id") Long id);
    @Query("SELECT p FROM ProductEntity p JOIN FETCH p.commentList WHERE p.id = (:id)")
    ProductEntity findByIdAndFetchCommentListEager(@Param("id") Long id);
}
