package com.example.secondkill.mapper;

import com.example.secondkill.pojo.Product;
import org.apache.ibatis.annotations.Param;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
public interface ProductMapper {

    Product getProduct(Long id);

    int decreaseProduct(@Param("id") Long id,@Param("quantity") int quantity);
}
