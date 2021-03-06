package com.msj.mapper;

import com.msj.pojo.Order;
import com.msj.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface OrderMapper {

    List<Order> selectOrderByUserId(Integer userId);

    Order selectOrderByUidAndOrderNo(@Param("userId") Integer userId,@Param("orderNo") BigInteger orderNo);

    int updateStatusByOrderNo(@Param("status")Integer status,
                                    @Param("orderNo") BigInteger orderNo);

    Order selectStatusByOrderNo(BigInteger orderNo);

    int addOrder(Order order);

    int deleteByPrimaryKey(Integer id);

    Order selectByPrimaryKey(Integer id);

    Order selectOrderByOrderNo(BigInteger orderNo);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}