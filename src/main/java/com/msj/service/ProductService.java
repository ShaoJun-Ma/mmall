package com.msj.service;

import com.github.pagehelper.PageInfo;
import com.msj.common.ServerResponse;
import com.msj.pojo.Product;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.util.List;

public interface ProductService {
    //门户
    ServerResponse getProductDetail(Integer productId);
    ServerResponse getProductList(Integer pageNum,Integer pageSize,Integer categoryId,String orderBy);

    //后台
    ServerResponse getList(Integer pageNum,Integer pageSize,HttpSession session);

    int editProductStatus(Integer id,Integer status);
    Product getProductById(Integer id);
    int addProduct(Product product);
    int editProduct(Product product);
}
