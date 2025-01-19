package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.Job;
@Repository
public class JobDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean addJob(Job job) {
		
		String query = "insert into job(job_name,job_desc,job_location,job_type,job_package,job_creation_date,job_vacancy,job_qualification,job_ending_date,user_id) value(?,?,?,?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(query,job.getJobName(),job.getJobDescription(),job.getJobLocation(),job.getJobType(),job.getJobPackage(),job.getJobCreationDate(),job.getJobVacancy(),job.getJobQualification(),job.getJobEndingDate(),job.getUserId());
		return result > 0;
	}
	
	public List<Job> getAllJobs(){
		String query = "select * from job";
		RowMapper<Job> map = new JobMapping();
		List<Job> jobs = jdbcTemplate.query(query, map);
		return jobs;
	}
}

class JobMapping implements RowMapper<Job>{
	@Override
	public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
		Job job = new Job();
		job.setId(rs.getInt(1));
		job.setJobName(rs.getString(2));
		job.setJobDescription(rs.getString(3));
		job.setJobLocation(rs.getString(4));
		job.setJobType(rs.getString(5));
		job.setJobPackage(rs.getString(6));
		job.setJobCreationDate(rs.getString(7));
		job.setJobVacancy(rs.getInt(8));
		job.setJobQualification(rs.getString(9));
		job.setJobEndingDate(rs.getString(10));
		job.setUserId(rs.getInt(11));
		return job;
	}
}
