package cz.jiripinkas.example.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.example.eshop.entity.OrderedItem;

public interface OrderedItemRepository extends
		JpaRepository<OrderedItem, Integer> {

}
