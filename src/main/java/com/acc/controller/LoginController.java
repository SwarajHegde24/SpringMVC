package com.acc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acc.dao.LoginDao;
import com.acc.model.LoginModel;
import com.acc.model.TShirtModel;

@Controller
public class LoginController {

	@Autowired
	private LoginDao ld;

	@RequestMapping(value = "beflog.obj", method = RequestMethod.GET)
	public String show(Model model) {
		model.addAttribute("ver", new LoginModel());
		return "login";
	}

	@RequestMapping(value = "verlogin.obj", method = RequestMethod.POST)
	public String verify(@ModelAttribute("ver") @Valid LoginModel login, BindingResult result, Model model) {

		// return "home";

		if (result.hasErrors()) {
			return "login";
		}
		if (ld.validator(login)) {
			return "home";
		} else {
			model.addAttribute("msg", "UserName or Password is invalid");

			return "login";
		}

	}

}
