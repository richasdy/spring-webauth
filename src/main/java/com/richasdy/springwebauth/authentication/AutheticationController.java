package com.richasdy.springwebauth.authentication;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class AutheticationController {

	@GetMapping("/login")
	public String index(Model model) {

		model.addAttribute("login", null);
		model.addAttribute("pageName", "Login");
		model.addAttribute("pageNameDesc", "Login Detail");

		return "authentication/login";
	}

	@PostMapping("/login")
	public String login(@Valid String entity, BindingResult result) {

		if (result.hasErrors()) {

			return "authentication/login";

		} else {

			return "redirect:/dashboard";
		}

	}

	@GetMapping("/register")
	public String register(Model model) {

		model.addAttribute("register", null);
		model.addAttribute("pageName", "Register");
		model.addAttribute("pageNameDesc", "Register Detail");

		return "authentication/register";
	}

}
