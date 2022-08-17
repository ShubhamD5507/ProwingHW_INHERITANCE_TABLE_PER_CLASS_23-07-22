package com.inheritance.table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Employee_Table")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
	
	@Id
	@Column(name = "Emp_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	@Column(name = "Emp_Name")
	
	private String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
}
