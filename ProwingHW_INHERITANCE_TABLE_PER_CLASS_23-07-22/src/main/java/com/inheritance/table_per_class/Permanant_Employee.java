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
public class Permanant_Employee extends Employee  {
	
	@Column(name = "Salary")
	private double salary;
	
	@Column(name = "Bonus")
	private double bonus;
	
	public Permanant_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permanant_Employee(double salary, double bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Permanant_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}
}
