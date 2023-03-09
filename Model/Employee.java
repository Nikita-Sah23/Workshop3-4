package Model;

public class Employee {
	
	
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int empId;
	private int salary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String firstName, String lastName, String address, String city, int empId, int salary) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.empId = empId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", empId=" + empId + ", salary=" + salary + "]";
	}
}
