package com.example.secondkill.service;

import com.example.secondkill.mapper.ProductMapper;
import com.example.secondkill.mapper.PurchaseRecordMapper;
import com.example.secondkill.pojo.Product;
import com.example.secondkill.pojo.PurchaseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    PurchaseRecordMapper purchaseRecordMapper;

    @Override
    @Transactional
    public boolean purchase(Long userId, Long productId, int quantity) {
        //获取产品
        Product product = productMapper.getProduct(productId);
        //比较库存和购买数量
        if (product.getStock() < quantity) {
            //库存不足
            return false;
        }
        //获取当前版本号
        int version = product.getVersion();
        //扣减库存
        productMapper.decreaseProduct(productId, quantity,version);
        //初始化购买记录
        PurchaseRecord record = this.initPurchaseRecord(userId, product, quantity);
        //插入购买记录
        purchaseRecordMapper.insertPurchaseRecord(record);
        return true;
    }

    private PurchaseRecord initPurchaseRecord(Long userId, Product product, int quantity) {
        PurchaseRecord record = new PurchaseRecord();
        record.setNote("购买日志，时间：" + System.currentTimeMillis());
        record.setPrice(product.getPrice());
        record.setProductId(product.getId());
        record.setQuantity(quantity);
        double sum = product.getPrice() * quantity;
        record.setSum(sum);
        record.setUserId(userId);
        return record;
    }
}
