package com.Spring.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="holidaydetail")
public class Holiday {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
		@Column(name = "date")
		Date date;
		
		String reason;
		
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			
			this.date = date;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}

}
