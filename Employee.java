// Class Declaration

public class Employee
{
	// Instance Variables
	int id;
	String name;
	int contact;
	
	// Constructor Declaration of Class
	public Employee(int id, String name,
				int contact)
	{
		this.id = id;
		this.name = name;
		this.contact = contact;
		
	}

	// method 1
	public int getM1()
	{
		return id;
	}

	// method 2
	public String getM2()
	{
		return name;
	}

	// method 3
	public int getM3()
	{
		return contact;
	}

	

	@Override
	public String toString()
	{
		return("Employee id is "+ this.getM1()+
			".\nEmployee name and contact are " +
			this.getM2()+"," + this.getM3());
	}

	public static void main(String[] args)
	{
		Employee raju = new Employee(1123,"Raju",99999999);
		System.out.println(raju.toString());
	}
}







//Here we used only one constructor employee and three methods M1(),M2(),M3()  and properties like Employee Id,Employee Name,Employee constructor. 
