package cz.jiripinkas.example.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.example.eshop.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}
