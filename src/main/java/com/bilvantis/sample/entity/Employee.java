package com.bilvantis.sample.entity;

import lombok.Data;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "EMPLOYEE_EMAIL")
    private String employeeEmail;

	@Column(name = "EMPLOYEE_GENDER")
    private String employeeGender;
    
    @Column(name = "EMPLOYEE_SALARY")
    private String employeeSalary;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
   

	public Employee() {
    }

    public Employee(String employeeName, String employeeEmail, String employeeGender, 
    		String employeeSalary, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeGender = employeeGender;
        this.employeeSalary = employeeSalary;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
  
    
    public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	
	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' + 
                ", employeeGender='" + employeeGender + '\'' + 
                 ", employeeSalary='" + employeeSalary + '\'' +
                  ", createdAt='" + createdAt + '\'' + 
                 ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
