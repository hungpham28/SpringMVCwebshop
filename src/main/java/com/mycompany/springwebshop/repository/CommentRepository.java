/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.springwebshop.repository;

import com.mycompany.springwebshop.entity.CommentEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Admin
 */
public interface CommentRepository extends CrudRepository<CommentEntity, Long>{
    
}
