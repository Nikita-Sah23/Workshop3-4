package Controller;

import java.util.Scanner;

import Interface.IEmployee;
import Model.Employee;
import service.EmployeeImp;

public class EmployeeManager {

	public static void main(String[] args) {

		IEmployee employee = (IEmployee) new EmployeeImp();

		// Employee emp1 = new Employee("Nikita","sah"," Delhi"," Tary", 526, 10000);
		// Employee emp2 = new Employee("Ankit","Sngh"," Mumbai"," Rtar", 527, 500000);
		// Employee emp3 = new Employee("rakshit","Sngh"," Mumbai"," Rtar", 527,
		// 300000);

		Scanner obj = new Scanner(System.in);

		System.out.println("Choose option");
		System.out.println("Enter 1 for show add employee");
		System.out.println("Enter 2 for show all employee");
		System.out.println("Enter 3 for remove employee");
		System.out.println("Enter 4 for sort employee");
		System.out.println("Enter 5 for  display");
		System.out.println("Enter 6 for  exit"); 

		int var = obj.nextInt();
		while (var != 5) {
			System.out.println("Choose option");
			System.out.println("Enter 1 for show add employee");
			System.out.println("Enter 2 for show all employee");
			System.out.println("Enter 3 for remove employee");
			System.out.println("Enter 4 for sort employee");
			System.out.println("Enter 5 for  display");
			System.out.println("Enter 6 for  exit");
			System.out.println(" Enter option");
			
			switch (var) {
			case 1:
		//	 boolean done = false;
		//	 while(done == false) {
			System.out.println("Enter first name");
				String firstName = obj.next();

				System.out.println("Enter last name");
				String lastName = obj.next();

				System.out.println("Enter address");
				String address = obj.next();

				System.out.println("Enter city");
				String city = obj.next();

				System.out.println("Enter EmpId");
				int empId = obj.nextInt();

				System.out.println("Enter salary");
				int salary = obj.nextInt();
				
				Employee emp = new Employee(firstName ,lastName, address, city,empId, salary);
				employee.addEmployee(emp);	
					
			//	break;
				
			case 2:
				employee.showAllEmp();
				break;

			case 3:
				employee.removeEmployee();

			case 4:
				employee.sortSalary(var);
			}
			//employee.addEmployee(emp);

			
			// employee.addEmployee(emp1);
			// employee.addEmployee(emp2);
			// employee.addEmployee(emp3);

		/*	System.out.println("-------Display all contacts---------");
			employee.showAllEmp();

			System.out.println("Remove contact");
			employee.removeEmployee();

			System.out.println("Sort all contacts on the basis of salary");
			employee.sortSalary(20000);
			employee.showAllEmp(); */

		}
	}
}
