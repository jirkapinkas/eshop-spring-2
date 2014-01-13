package cz.jiripinkas.example.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.example.eshop.entity.Role;
import cz.jiripinkas.example.eshop.entity.User;
import cz.jiripinkas.example.eshop.entity.UserRole;
import cz.jiripinkas.example.eshop.repository.RoleRepository;
import cz.jiripinkas.example.eshop.repository.UserRepository;
import cz.jiripinkas.example.eshop.repository.UserRoleRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRoleRepository userRoleRepository;

	public void register(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPass = encoder.encode(user.getPassword());
		user.setPassword(encodedPass);
		System.out.println(encodedPass);
		
		user = userRepository.save(user);
		Role role = roleRepository.findByName("ROLE_USER");
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoleRepository.save(userRole);
	}
}
