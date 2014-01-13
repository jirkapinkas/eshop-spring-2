package cz.jiripinkas.example.eshop.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.example.eshop.entity.Item;
import cz.jiripinkas.example.eshop.entity.OrderedItem;
import cz.jiripinkas.example.eshop.entity.Role;
import cz.jiripinkas.example.eshop.entity.UserOrder;
import cz.jiripinkas.example.eshop.repository.OrderedItemRepository;
import cz.jiripinkas.example.eshop.repository.RoleRepository;

@Service
@Transactional
public class DbInitService {

	@Autowired
	private ItemService itemService;

	@Autowired
	private UserOrderService userOrderService;

	@Autowired
	private OrderedItemRepository orderedItemRepository;

	@Autowired
	private RoleRepository roleRepository;

	// initialize database each day
	// @Scheduled(fixedDelay = 86400000)
	@PostConstruct
	public void init() {
		System.out.println("*** START INIT DATABASE ***");

		{
			Role role = new Role();
			role.setName("ROLE_USER");
			roleRepository.save(role);
		}

		{
			Role role = new Role();
			role.setName("ROLE_ADMIN");
			roleRepository.save(role);
		}

		{
			Item item = new Item();
			item.setName("Java in 21 days");
			item.setDescription("EBook");
			item.setPrice(500);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Java cup");
			item.setDescription("Coffee cup");
			item.setPrice(100);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Java t-shirt");
			item.setDescription("T-shirts for all Java programmers");
			item.setPrice(500);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Professional Java consulting");
			item.setDescription("per manhour");
			item.setPrice(800);
			itemService.save(item);
		}
		{
			Item item = new Item();
			item.setName("Professional Java training");
			item.setDescription("per manday");
			item.setPrice(800);
			itemService.save(item);
		}

		UserOrder userOrder = new UserOrder();
		userOrder.setName("JP");
		userOrder.setCity("HK");
		userOrder.setOrderDate(new Date());
		userOrder.setStreet("Ulice");
		userOrder.setZip("500 11");

		userOrder = userOrderService.save(userOrder);

		OrderedItem orderedItem1 = new OrderedItem();
		orderedItem1.setItem(itemService.findOne(1));
		orderedItem1.setQuantity(10);
		orderedItem1.setUserOrder(userOrder);
		orderedItemRepository.save(orderedItem1);

		OrderedItem orderedItem2 = new OrderedItem();
		orderedItem2.setItem(itemService.findOne(2));
		orderedItem2.setQuantity(5);
		orderedItem2.setUserOrder(userOrder);
		orderedItemRepository.save(orderedItem2);

		System.out.println("*** FINISH INIT DATABASE ***");
	}

}
