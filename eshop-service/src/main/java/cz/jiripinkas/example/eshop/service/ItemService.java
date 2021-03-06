package cz.jiripinkas.example.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.example.eshop.entity.Item;
import cz.jiripinkas.example.eshop.exception.ItemNotFoundException;
import cz.jiripinkas.example.eshop.repository.ItemRepository;

@Service
@Transactional
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public Item save(Item item) {
		return itemRepository.save(item);
	}

	public Item findOne(int itemId) {
		Item item = itemRepository.findOne(itemId);
		if(item == null) {
			throw new ItemNotFoundException("");
		}
		return item;
	}

	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	public void remove(int itemId) {
		itemRepository.delete(itemId);
	}

}
