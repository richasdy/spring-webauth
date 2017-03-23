package com.richasdy.springwebauth.dashboard;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller
@RequestMapping("dashboard")
public class DashboardController {

	@GetMapping()
	public String index(Model model) {

		model.addAttribute("dashboard", null);

		model.addAttribute("pageName", "Dashboard");
		model.addAttribute("pageNameDesc", "Dashboard detail");

		return "dashboard/index";
	}

}
