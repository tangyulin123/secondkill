package com.example.secondkill.pojo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
@Alias("product")
@Getter
@Setter
public class Product implements Serializable {

    private Long id;

    private String productName;

    private int stock;

    private double price;

    private int version;

    private String note;
}
