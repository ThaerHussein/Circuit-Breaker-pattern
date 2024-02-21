package com.letcode.Stock.service;

import com.letcode.Stock.bo.CreateStockRequest;
import com.letcode.Stock.bo.UpdateStockResponse;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);
}
