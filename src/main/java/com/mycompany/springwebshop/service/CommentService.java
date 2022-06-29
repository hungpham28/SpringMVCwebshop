/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.service;

import com.mycompany.springwebshop.entity.CommentEntity;
import com.mycompany.springwebshop.repository.CommentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    
    public CommentEntity getCommentById(long id){
        return commentRepository.findById(id).orElse(null);
    }
    
    public List<CommentEntity> getListComments(){
        return (List<CommentEntity>) commentRepository.findAll();
    }
}
