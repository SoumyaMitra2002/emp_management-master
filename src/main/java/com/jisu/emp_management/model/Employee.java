package com.jisu.emp_management.model;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(
		name = "EMPLOYEE",
		uniqueConstraints =
				@UniqueConstraint(columnNames = {"empId","email"})
)
public class Employee {

    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empId")
    private Integer empId;
    private String name;

    private String gender;

	@Column(name = "email")
    private String email;

    private String contact;

    private String address;

    private String pincode;
    
    private String password;

    @ManyToOne()
    private Department department;
    
    
    @OneToOne
    private Image image;

	private String date;
	
	@OneToMany(mappedBy = "emp")
	private List<Message> message;

	
	 @ManyToMany(mappedBy = "employees",cascade = CascadeType.ALL)
	 private Set<Task> tasks = new HashSet<>();
	

	public Employee(Integer empId, String name, String gender, String email, String contact, String address,
			String pincode, Department dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.pincode = pincode;
		this.department = dept;
		
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Department getDept() {
		return department;
	}

	public void setDept(Department dept) {
		this.department = dept;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public void setImage(Image image2) {
		// TODO Auto-generated method stub
		this.image=image2;
	}
	
	public Image getImage() {
		return image;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	
	

	
	
	
}
