package com.bdmanager.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bdmanager.model.BirthInfo;
import com.bdmanager.service.BirthInfoService;

@Controller
@RequestMapping("/birthday")
public class BirthdayController {

	@Autowired
	private BirthInfoService birthInfoService;

    @RequestMapping(value = { "/", "/listBirthdays" })
    public String listBirthdays(Map<String, Object> map) {

        map.put("birthday", new BirthInfo());
        map.put("birthdayList", birthInfoService.listBirthdays());

        return "/birthday/listBirthdays";
	}

    @RequestMapping("/get/{birthdayId}")
    public String getBirthday(@PathVariable Long birthdayId, Map<String, Object> map) {

        BirthInfo birthday = birthInfoService.getBirthday(birthdayId);

        map.put("birthday", birthday);

        return "/birthday/bdForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBirthday(@ModelAttribute("birthday") BirthInfo birthday,
			BindingResult result) {

        birthInfoService.saveBirthday(birthday);
        return "redirect:listBirthdays";
	}

    @RequestMapping("/delete/{birthdayId}")
    public String deleteBirthday(@PathVariable("birthdayId") Long id) {

        birthInfoService.deleteBirthday(id);
        return "redirect:/birthday/listBirthdays";
	}
}
