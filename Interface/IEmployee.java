package Interface;

import Model.Employee;

public interface IEmployee {
	
	void addEmployee(Employee emp);
	void removeEmployee();
	void serachEmployee (int empID);
	void sortSalary( int salary);
	void showAllEmp();

}
