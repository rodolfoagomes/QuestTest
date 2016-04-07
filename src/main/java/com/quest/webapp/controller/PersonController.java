package com.quest.webapp.controller;

import com.quest.webapp.entity.Person;
import com.quest.webapp.service.PersonServiceInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

/**
 * Created by rodolfoagomes on 06/04/2016.
 */
@Controller
@ComponentScan
public class PersonController {

	@Autowired
	PersonServiceInterf personServiceInterf;
	
	@RequestMapping(value = {"/","/page"}, method = RequestMethod.GET)
	public String page(Model model) {
		return "index";
	}

	@RequestMapping(value = {"/addPage"}, method = RequestMethod.GET)
	public String addPage(Model model) {
		model.addAttribute("person", new Person());
		return "addPage";
	}

	@RequestMapping(value = {"/listPage"}, method = RequestMethod.GET)
	public String addList(Model model) {
		model.addAttribute("all", (ArrayList<Person>) personServiceInterf.getAll());
		return "listPage";
	}


	@RequestMapping(value = {"/person/save"}, method = RequestMethod.POST)
	public String save(@ModelAttribute("person") Person person,
			final RedirectAttributes redirectAttributes) {

		if(personServiceInterf.save(person)!=null) {
			redirectAttributes.addFlashAttribute("savePerson", "success");
		} else {
			redirectAttributes.addFlashAttribute("savePerson", "unsuccess");
		}
		
		return "redirect:/addPage";
	}

}
