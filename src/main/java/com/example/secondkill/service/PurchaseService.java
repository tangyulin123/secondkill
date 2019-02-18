package com.example.secondkill.service;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
public interface PurchaseService {

    boolean purchase(Long userId, Long productId, int quantity);
}
