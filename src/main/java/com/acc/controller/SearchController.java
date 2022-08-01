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
import com.acc.dao.TShirtDao;
import com.acc.model.LoginModel;
import com.acc.model.TShirtModel;

@Controller
public class SearchController {

	@Autowired
	private TShirtDao ld;

	@RequestMapping(value = "add.obj", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("shirtModel", new TShirtModel());
		return "shirts";
	}

	@RequestMapping(value = "add.obj", method = RequestMethod.POST)
	public String verify(@ModelAttribute("shirtModel") @Valid TShirtModel shirts, BindingResult result, Model model) {

		// return "home";

		if (result.hasErrors()) {
			return "home";
		}
		if (ld.validator(shirts)) {
			return "shirts";
		} else {
			model.addAttribute("msg", "UserName or Password is invalid");

			return "home";
		}

	}

}
