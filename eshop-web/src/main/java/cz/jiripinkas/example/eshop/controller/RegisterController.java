package cz.jiripinkas.example.eshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cz.jiripinkas.example.eshop.entity.User;
import cz.jiripinkas.example.eshop.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public User create() {
		return new User();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String show() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid User user,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		userService.register(user);
		return "redirect:/register.html?success=true";
	}
}
