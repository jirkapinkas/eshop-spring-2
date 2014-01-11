package cz.jiripinkas.example.eshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cz.jiripinkas.example.eshop.entity.UserOrder;

public interface UserOrderRepository extends JpaRepository<UserOrder, Integer> {

	@Query("select distinct o from UserOrder o left join fetch o.orderedItems")
	public List<UserOrder> findAllFetch();

}
