package com.jisu.emp_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Department {

    @Id
    private Integer deptId;
    private String deptName;
	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployess() {
		return employess;
	}

	public void setEmployess(List<Employee> employess) {
		this.employess = employess;
	}

	@OneToMany(mappedBy = "department")
	private List<Employee> employess;
	
	
}
