package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.Job;
import com.services.JobService;

@Controller
public class HomeController {
	
	@Autowired
	JobService jobService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<Job> jobs = jobService.getAllJobs();
		model.addAttribute("jobs", jobs);
		return "index";
	}
}
