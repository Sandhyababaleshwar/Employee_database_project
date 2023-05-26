package customsorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeBySalary implements Comparator<Employee>
{
	@Override
	public int compare (Employee e1, Employee e2)
	{
	Double x= e1.getSal();  //2.8
	Double y= e2.getSal();  //2.6
	return x.compareTo(y);   //2.8.compareTo(2.6)  --> -1
	
	}
}
//e1--> object to be inserted 
//e2--> already existing object

