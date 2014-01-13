package cz.jiripinkas.example.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.example.eshop.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
