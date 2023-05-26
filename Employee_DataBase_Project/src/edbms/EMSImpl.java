package edbms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customexception.EmployeeNotFoundException;
import customexception.StudentNotFoundException;
import sdbms.Student;


public  class EMSImpl implements EmployeeManagementSystem 
{
	
	Scanner scan=new Scanner(System.in);
	Map<String,Employee>db=new LinkedHashMap<String,Employee>();

	@Override
	public void addEmployee()
	{
		System.out.println("Enter the Employee Age: ");
		int age=scan.nextInt();

		System.out.println("Enter the Employee Name: ");
		String name=scan.next();

		System.out.println("Enter the Employee Salary: ");
		double salary=scan.nextDouble();

		Employee emp=new Employee(age,name,salary);
		db.put(emp.getId(), emp);
		System.out.println("Employee Record Inserted Successfully!");
		System.out.println("Employee Id is "+emp.getId());	
	}

	@Override
	public void displayEmployee()
	{
		
		System.out.println("Enter Employee Id: ");
		String id=scan.next();       //String id=scan.next().toUpperCase();
		id=id.toUpperCase();

		if(db.containsKey(id))
		{
			Employee emp=db.get(id);   // getting value (student object)
			System.out.println("Employee Detailes are as Follows");
			System.out.println("Id: "+emp.getId());
			System.out.println("Age: "+emp.getAge());
			System.out.println("Name: "+emp.getName());
			System.out.println("Marks: "+emp.getSal());
		}
		else 
			
		{
			try {
				String message="Employee with the Id"+id+" is not Found!";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}


	@Override
	public void displayAllEmployee()
	{
		
		if(db.size()!=0) {
			System.out.println("Employee Records are as follows: ");
			System.out.println("--------------------------------");
			Set<String> keys= db.keySet();   
			for(String key: keys) {
				Employee emp=db.get(key);
				System.out.println(emp) ;  //  System.out.println(db.get(key));
			}
		}
		else 
			
		{
			try {
				String message="Employee Database is Empty , Nothing to Display";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}


	@Override
	public void removeEmployee()
	{

		if(db.size()!=0) {
			System.out.println("Available Employee Records: "+db.size());
			db.clear();
			System.out.println("All the Employees records deleted Successfully");
		}
		else 
			
		{
			try {
				String message="Employee Database is Empty, Nothing to Delete";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}	
	

	@Override
	public void removeAllEmployee() {
		
	}

	@Override
	public void updateEmployee() {
		
	}

	@Override
	public void countEmployee() {
		
	}

	@Override
	public void sortEmployee() {
		
	}

	@Override
	public void getEmployeeWithHighestSal() {
		
	}

	@Override
	public void getEmployeeWithLowestSal() {
		
	}

}
