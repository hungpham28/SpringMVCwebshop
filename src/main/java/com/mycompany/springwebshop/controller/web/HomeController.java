/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.controller.web;

import com.mycompany.springwebshop.component.SessionBean;
import com.mycompany.springwebshop.entity.ProductEntity;
import com.mycompany.springwebshop.entity.ShopEntity;
import com.mycompany.springwebshop.model.ClientDTO;
import com.mycompany.springwebshop.model.ProductDTO;
import com.mycompany.springwebshop.model.ShopDTO;
import com.mycompany.springwebshop.service.ClientService;
import com.mycompany.springwebshop.service.CommentService;
import com.mycompany.springwebshop.service.OwnerShopService;
import com.mycompany.springwebshop.service.ProductService;
import com.mycompany.springwebshop.until.FormNumber;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class HomeController {
    @Autowired
    private ProductService productService;
    
    @Autowired
    private OwnerShopService shopService;
    
    
    @Autowired
    private CommentService commentService;
    
    @Autowired
    private ClientService clientService;
    
    
    @RequestMapping(value = {"/","/Trangchu"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("Home");
        mav.addObject("shopList",shopService.getShops());
        return mav;
    }

    @RequestMapping(value = "/Product/{id}", method = RequestMethod.GET)
    public ModelAndView detailPage(@PathVariable(value="id") long id) {
        ModelAndView mav = new ModelAndView("Detail");
        ProductDTO product=productService.getProductByID(id);
        mav.addObject("product",product);
      
        mav.addObject("commentList",product.getCommentsList());
        return mav;
    }

    @RequestMapping(value = "/SignUpIn", method = RequestMethod.GET)
    public ModelAndView LoginRegistPage() {
        ModelAndView mav = new ModelAndView("SignUp-In/SignUpIn");
        System.out.println(1);
	    mav.addObject("user", new ClientDTO());
	    mav.addObject("shop", new ShopDTO());
        return mav;
    }
    @RequestMapping(value = "/loginSuccessStatus", method = RequestMethod.GET)
    public String LoginPage(Authentication authentication,HttpSession session) {
    	String username=authentication.getName();
    	ClientDTO client=clientService.getUserDTOByUsername(username);
    	session.setAttribute("client", clientService.getUserDTOByUsername(username));
        session.setAttribute("itemCartList", client.getItemcartList() );
        return "redirect:/Trangchu";
    }
    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String LogoutPage() {
        return "redirect:/Trangchu";
    }
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied() {   
        return "Eror";
    }
    @GetMapping("/User/Cart")
    public ModelAndView CartPage() {
        ModelAndView mav = new ModelAndView("ActionDataPage/Cart");
        mav.addObject("FormNumber",new FormNumber());xScoped variables from session scope
        mav.addObject("subTotal",(long)0);

        return mav;
    }

}
