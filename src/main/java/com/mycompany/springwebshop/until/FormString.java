/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.until;

/**
 *
 * @author Admin
 */
public class FormString {

    public static String getFewChar(String text) {
        return text.length() > 50 ? text.substring(0, 50) + "..." : text;
    }
}
