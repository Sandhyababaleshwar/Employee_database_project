package edbms;

public class Employee
{
private String id;
private int age;
private String name;
private double sal;
static int count=101;

public Employee(int age,String name,double sal) {
	this.id="EMP"+count;
	this.age=age;
	this.name=name;
	this.sal=sal;
	count++;
}

public String getId() 
{
	return id;
}
public int getAge() 
{
	return age;
}

public void setAge(int age) 
{
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public double getSal() 
{
	return sal;
}

public void setSal(double sal)
{
	this.sal = sal;
}

public static int getCount()
{
	return count;
}

public static void setCount(int count)
{
	Employee.count = count;
}

@Override
public String toString() 
{
	return "Id: "+id+" Age:"+age+"  Name:"+name+"  Salary:"+sal;
}

}
