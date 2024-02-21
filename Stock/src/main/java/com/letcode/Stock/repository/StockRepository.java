package com.letcode.Stock.repository;

import com.letcode.Stock.entiity.StockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockEntity, Long> {

	Iterable<StockEntity> findByItem(String item);
}
