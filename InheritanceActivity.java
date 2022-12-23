class Employee2//parent class
{
	long employee_id;
	String employee_name;
	String employee_Address;
	long employee_phone;
	double basicSalary=0.0;
	double specialAllowance=250.80;
	double Hra=1000.50;

	public Employee2 (long id,String name,String address,long phone) {
		employee_id=id;
		employee_name=name;
		employee_Address=address;
		employee_phone=phone;
	}
	public void calculateSalary(){//created method calculateSalary  
	double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
	System.out.println("Total Salary: "+Salary);
}
public void calculateTransportAllowance()
{
	double transportAllowance=0.1*basicSalary;
}
}
class Manager extends Employee2{
double basicSalary;
public Manager(int Id,String Name,String Address,long Phone,double Salary)
{
	super(Id,Name,Address,Phone);
	basicSalary=Salary;
}
public void calculateSalary()
{
		
	double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
	System.out.println("Total Salary of Manager is: "+Salary);
}
public void calculateTransportAllowance()
{
	double transportAllowance=0.15*basicSalary;
	double Salary= transportAllowance+basicSalary;
	System.out.println("After calculating TransportAllowance the salary of Manager is: "+Salary);
}
public void getData()
{
	System.out.println("Id: "+employee_id+"\n"+"Name: "+employee_name+"\n"+"Address: "+employee_Address+"\n"+"Phone: "+employee_phone+"\n"+"Basic Salary: "+basicSalary);
	
}
}
class Trainee extends Employee2{
double basicSalary;
public Trainee(int Id,String Name,String Address,long Phone,double Salary)
{
	super(Id,Name,Address,Phone);
	basicSalary=Salary;
}
public void calculateSalary()
{
		
	double Salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
	System.out.println("Total Salary of Trainee is: "+Salary);
}
public void calculateTransportAllowance()
{
	double transportAllowance=0.1*basicSalary;
	double Salary=transportAllowance+basicSalary;
	System.out.println("After calculating TransportAllowance the salary of Trainee is: "+Salary);
	
}
public void getData()
{
	System.out.println("Id: "+employee_id+"\n"+"Name: "+employee_name+"\n"+"Address: "+employee_Address+"\n"+"Phone: "+employee_phone+"\n"+"Basic Salary: "+basicSalary);
	
}
}
public class InheritanceActivity {

public static void main(String[] args) {
	Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
	Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
	m.getData();
	t.getData();
	m.calculateSalary();
	t.calculateSalary();
	m.calculateTransportAllowance();
	t.calculateTransportAllowance();
}

}

