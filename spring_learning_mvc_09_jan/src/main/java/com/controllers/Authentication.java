package com.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.User;
import com.services.UserService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Authentication {
	
	@Autowired
	private UserService userService;

	// Handlers
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping(path="/auth/register", method = RequestMethod.POST)
	public void registerUser(@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("email") String email, @RequestParam("password") String password,HttpServletResponse response) {
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		boolean result = userService.registerUser(user);
		if (result) {
			try {
				response.sendRedirect("login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				response.sendRedirect("registration");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@RequestMapping(path="/auth/login",method = RequestMethod.POST)
public void loginUser(@RequestParam("email") String email, @RequestParam("password") String password,HttpServletResponse reponse,HttpSession session) {
		User user = userService.loginUser(email, password);
		if (user == null) {
			try {
				reponse.sendRedirect("/spring_learning_mvc_09_jan/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				session.setAttribute("user_info", user);
				reponse.sendRedirect("/spring_learning_mvc_09_jan/home");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
}
