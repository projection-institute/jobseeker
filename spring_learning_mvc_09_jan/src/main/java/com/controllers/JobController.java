package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.beans.Job;
import com.beans.User;
import com.services.JobService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class JobController {
	
	@Autowired
	JobService jobService;
	
	
	@RequestMapping("/addJob")
	public String addJob() {
		return "addJob";
	}
	
	@RequestMapping("/addJobHandler")
	public RedirectView addJobHandler(@ModelAttribute Job job,HttpSession session,HttpServletRequest request) {
		RedirectView rv = new RedirectView();
		User user = (User)session.getAttribute("user_info");
		if (user == null) {
			rv.setUrl(request.getContextPath() + "/");
			return rv;
		}
		job.setUserId(user.getId());
		System.out.println(job);
		boolean result = jobService.addJob(job);
		
		if (result) {
			rv.setUrl(request.getContextPath() + "/home");
		}else {
			rv.setUrl(request.getContextPath() + "/addJob");
		}
		return rv;
	}

}
