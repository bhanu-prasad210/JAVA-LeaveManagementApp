package com.LeaveManagement.Model;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.LeaveManagement.Annotations.PasswordValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="employee")
public class Employee extends BaseEntity {

	@Past
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfBirth;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int emplid;

	@Column(name = "leave_balance")
	private int leaveBalance;


	@NotBlank(message = "Name cannot be blank")
	@Size(min = 3, message = "size cannot be less than 3 characters")
	private String name;

	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Please provide a valid email")
	private String email;

	private int supervisorId;

	@Enumerated(EnumType.STRING)
	private Role role;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	private String username;

	@NotNull(message = "Password cannot be null")
	@PasswordValidator
	private String password;

	public Employee() {};

	public Employee(int id, int emplid, String name, String email, int supervisorId, Role role, Gender gender,
					String username, Date dateOfBirth) {
		super();
		this.id = id;
		this.emplid = emplid;
		this.name = name;
		this.email = email;
		this.supervisorId = supervisorId;
		this.role = role;
		this.gender = gender;
		this.username = username;
		this.dateOfBirth = dateOfBirth;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getEmplid() {
		return emplid;
	}

	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}

	public int getLeaveBalance() { return leaveBalance; }

	public void setLeaveBalance(int leaveBalance) { this.leaveBalance = leaveBalance; }

	public int getId() { return id; }

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {	return password;
	}

	public void setPassword(String password) {	this.password = password;	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", emplid=" + emplid + ", name=" + name + ", email=" + email + ", supervisorId="
				+ supervisorId + ", role=" + role + ", gender=" + gender + ", username=" + username + ", dateOfBirth="
				+ dateOfBirth + "]";
	}



	
	
	
}