package com.Spring.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Spring.entity.Holiday;
import com.Spring.repository.HolidayRepository;

@Service("holidayservice")
public class HolidayService {
	
	
	HolidayRepository holidayrepository;
	
	@Autowired
	 public HolidayService(HolidayRepository holidayrepository) {
		this.holidayrepository = holidayrepository;
	}

	public String addUser(Holiday holidaydetail) {
		Holiday holidaydet = (Holiday)holidayrepository.findByDate(holidaydetail.getDate());
		if(holidaydet==null) {
		 System.out.println("HELLO"+holidaydetail.getDate()+"    "+holidaydetail.getReason());
	        holidayrepository.save(holidaydetail);
	        return "Holiday has been added on : " + holidaydetail.getDate();
	    }
		return "DATA ALREADY THERE";
	}
	 
	    public List<Holiday> findAllHoliday() {
	    	List<Holiday> holidaylist = (List<Holiday>) holidayrepository.findAll();
	        if (holidaylist != null) {
	           return holidaylist;
	        }
	        return null;
	    }
	 	

	    public Holiday findByDate(Date date) {
	    	Holiday holidaylist = (Holiday) holidayrepository.findByDate(date);

	        if (holidaylist != null) {
	            return holidaylist;
	        }
	        return null;
	    }
	 	

	    public String deleteBydeptid(long date) {
	    	holidayrepository.deleteByDate(date);
	        return "Deleted Successfully";
	    }

}
