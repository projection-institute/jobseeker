package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Job;
import com.dao.JobDao;

@Service
public class JobService {
	
	@Autowired
	JobDao jobDao;
	public boolean addJob(Job job) {
		return jobDao.addJob(job);
	}
	
	public List<Job> getAllJobs(){
		return jobDao.getAllJobs();
	}

}
