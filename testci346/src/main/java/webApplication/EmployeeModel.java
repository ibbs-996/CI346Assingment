package webApplication;

import lombok.Data;

import java.util.Arrays;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




@Entity
public class EmployeeModel {

	private @Id @GeneratedValue long Id;
	private String employeeID; // Assign unique ID to each employee
	private @Column(nullable = false) String Firstname;
	private @Column String LastName;
	private @Column String ShiftStart;
	private @Column String ShiftEnd;

	
	private String GetEmployeeID() {
		return employeeID;
	}

	public EmployeeModel(String employeeID, String name,String LastName, String ShiftEnd, String ShiftStart) {
		this.employeeID = employeeID;
		this.Firstname = name;
		this.LastName = LastName;
		this.ShiftStart = ShiftStart;
		this.ShiftEnd = ShiftEnd;
	}

	

	public String getName() {
		return Firstname;
	}
}