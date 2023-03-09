package service;

import java.util.LinkedList;

import Interface.IEmployee;
import Model.Employee;

public class EmployeeImp implements IEmployee {

	private LinkedList<Employee> LL = new LinkedList<Employee>(); // for storing data

	@Override
	public void addEmployee(Employee emp) {
		LL.add(emp);
		System.out.println(" Employee added" );

	}

	@Override
	public void removeEmployee() {
		LL.remove();
		System.out.println(" Employee removed");

	}

	@Override
	public void serachEmployee(int empID) {
		for (Employee e : LL) {
			if (e.getEmpId() == empID) {
				System.out.println(e);
			}

		}
	}

	@Override
	public void sortSalary(int salary) {

		LL.sort((obj1, obj2) -> obj1.getSalary() - obj2.getSalary()); // used temp obj for compa

	}

	@Override
	public void showAllEmp() {

		for (Employee e : LL) {
			System.out.println(e);
		}

	}

}
