package com.LeaveManagement.Model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.FutureOrPresent;

@Entity
@Table(name = "leave_request")
public class LeaveRequest extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int emplid;

	@FutureOrPresent
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date leaveStartDate;

	@FutureOrPresent
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date leaveEndDate;

	private double duration;
	private String description;
	private String comment;
	private int supervisorId;

	private int leaveBalance ;

	public LeaveRequest() {};

	public LeaveRequest(int id, int emplid, Date leaveStartDate, Date leaveEndDate, double duration, String description,
						String comment, int supervisorId, int leaveBalance, LeaveStatus leaveStatus) {
		super();
		this.id = id;
		this.emplid = emplid;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.duration = duration;
		this.description = description;
		this.comment = comment;
		this.supervisorId = supervisorId;
		this.leaveBalance = leaveBalance;
		this.leaveStatus = leaveStatus;
	}

	public int getEmplid() {
		return emplid;
	}

	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLeaveStartDate() {
		return leaveStartDate;
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate ;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	@Enumerated(EnumType.STRING)
	 private LeaveStatus leaveStatus;

	@Override
	public String toString() {
		return "LeaveRequest [id=" + id + ", emplid=" + emplid + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", duration=" + duration + ", description=" + description
				+ ", comment=" + comment + ", supervisorId=" + supervisorId + ", leaveBalance=" + leaveBalance
				+ ", leaveStatus=" + leaveStatus + "]";
	}


}