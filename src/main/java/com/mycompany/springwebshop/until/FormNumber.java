/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.until;

/**
 *
 * @author Admin
 */
public class FormNumber {
    	public static String formMoney(String amount) {
		char num[]=amount.toCharArray();
		String money="";
		int len=0;
		for(int i=num.length-1; i>=0;i--) {
			len++; 
			money=num[i]+money;
			if(len%3==0 && len!=0 && i!=0) {
				money='.'+money;
			}
		}
		
		return money;
	}
	public static String formMoneytoInteger(String amount) {
		char[] num=amount.toCharArray();
		amount="";
		for(char a: num) if(a!='.' && a!=',')amount+=a;
		return amount;
	}
	public static String formSold(long amount) {
		return (amount>=1000?  (amount/100/10.0)+"k":""+amount).replace('.', ',');
	}
}
