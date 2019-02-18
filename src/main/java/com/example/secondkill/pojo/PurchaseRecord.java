package com.example.secondkill.pojo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
@Alias("purchaseRecord")
@Getter
@Setter
public class PurchaseRecord implements Serializable {

    private Long id;

    private Long userId;

    private Long productId;

    private double price;

    private int quantity;

    private double sum;

    private Timestamp purchaseTime;

    private String note;
}
