package edbms;

import java.util.Scanner;

import customexception.InvalidChoiceException;

public class Solution 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Database Project");
		System.out.println("-----------------------------------");

		Scanner scan=new Scanner (System.in);
		EmployeeManagementSystem ems=new EMSImpl();

		while(true) {
			System.out.println("1:Add Employee\n2:Display Employee");
			System.out.println("3:Display All Employee\n4:Remove Employee");
			System.out.println("5:Remove All Employee\n6:Update Employee");
			System.out.println("7:Count Employee\n8:Sort Employee");
			System.out.println("9:Get Employee with HIghest Salary");
			System.out.println("10:Get Employee with Lowest Salary");
			System.out.println("11:Exit\n Enter Choice:");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				ems.addEmployee();
				break;
			case 2:
				ems.displayEmployee();
				break;
			case 3:
				ems.displayAllEmployee();
				break;
			case 4:
				ems.removeEmployee();
				break;
			case 5:
				ems.removeAllEmployee();
				break;
			case 6:
				ems.updateEmployee();
				break;
			case 7:
				ems.countEmployee();
				break;
			case 8:
				ems.sortEmployee();
				break;
			case 9:
				ems.getEmployeeWithHighestSal();
				break;
			case 10:
				ems.getEmployeeWithLowestSal();
				break;
			case 11:
				System.out.println("Thank You!!!!");
				System.exit(0);
			default:
				//create package -> customexception -> create class - InvalidChoiceException -> throw
				try {
					String message="Invalid Choice, Enter Valid Choice";
					throw new InvalidChoiceException(message);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}
			System.out.println("--------------------");
		}   
	}
}













