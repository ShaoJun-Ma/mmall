package com.msj.controller.portal;

import com.msj.common.Const;
import com.msj.common.ServerResponse;
import com.msj.pojo.Cart;
import com.msj.pojo.User;
import com.msj.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.rmi.ServerError;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    //购物车List列表
    @RequestMapping("/list.do")
    @ResponseBody
    public ServerResponse list(HttpSession session){
        return cartService.getCartProductList(session);
    }

    //购物车添加商品
    @RequestMapping("/add.do")
    @ResponseBody
    public ServerResponse add(Integer productId,Integer count,HttpSession session){
        return cartService.add(productId,count,session);
    }

    //购物车添加商品
    @RequestMapping("/update.do")
    @ResponseBody
    public ServerResponse update(Integer productId,Integer count,HttpSession session){
        return cartService.update(productId,count,session);
    }


}

