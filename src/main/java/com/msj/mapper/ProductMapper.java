package com.msj.mapper;

import com.msj.pojo.Product;
import com.msj.pojo.ProductWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<Product> selectByCategoryId(@Param("categoryId") Integer categoryId,@Param("orderBy") String orderBy);

    Product selectByPrimaryKey(Integer id);

    List<Product> selectAllProducts();

    List<Product> selectByType(@Param("productName")String productName,@Param("id")Integer id);

    int updateProductStatus(@Param("id") Integer id, @Param("status") Integer status);




    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductWithBLOBs record);

    int updateByPrimaryKey(Product record);

    int insertProduct(Product product);

    int updateProduct(Product product);



}