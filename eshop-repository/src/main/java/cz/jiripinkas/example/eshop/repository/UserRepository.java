package cz.jiripinkas.example.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.example.eshop.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
