package com.inheritance.table_per_class;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@AttributeOverrides({
	@AttributeOverride(name = "eid",column = @Column(name="EmpID")),
	@AttributeOverride(name = "name",column = @Column(name="EmpName"))})
public class Contract_Employee extends Employee  {

	
	@Column(name = "PAY_PerHours")
	private double payPerHrs;
	@Column(name = "Duration")
	private String Duration;
	
	public Contract_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract_Employee(double payPerHrs, String duration) {
		super();
		this.payPerHrs = payPerHrs;
		Duration = duration;
	}

	public double getPayPerHrs() {
		return payPerHrs;
	}

	public void setPayPerHrs(double payPerHrs) {
		this.payPerHrs = payPerHrs;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	@Override
	public String toString() {
		return "Contract_Employee [payPerHrs=" + payPerHrs + ", Duration=" + Duration + "]";
	}
	
}
