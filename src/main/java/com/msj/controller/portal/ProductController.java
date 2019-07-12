package com.msj.controller.portal;

import com.github.pagehelper.PageInfo;
import com.msj.common.Const;
import com.msj.common.ServerResponse;
import com.msj.pojo.Product;
import com.msj.service.portal.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     *
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return
     */
    @RequestMapping("/list.do")
    @ResponseBody
    public ServerResponse list(Integer categoryId, @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "10")Integer pageSize,
                               @RequestParam(value = "orderBy",defaultValue = "") String orderBy){
        //todo 根据categoryId查询
        PageInfo<Product> products = productService.getProductList(pageNum,pageSize);
        return ServerResponse.createSuccess(products);
    }

    /**
     * 产品详情
     * @param productId
     * @return
     */
    @RequestMapping("/detail.do")
    @ResponseBody
    public ServerResponse detail(Integer productId){
        Product product = productService.selectDetail(productId);
        if(product!=null){
            return ServerResponse.createSuccess(product);
        }
        return ServerResponse.createErrorByMessage(Const.PRODUCT_DETAIL_ERROR);
    }
}
