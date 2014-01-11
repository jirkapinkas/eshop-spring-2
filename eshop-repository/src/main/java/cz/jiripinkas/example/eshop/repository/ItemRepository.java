package cz.jiripinkas.example.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.example.eshop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	

}
