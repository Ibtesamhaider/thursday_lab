/*write a program to calculate gross salary of an employee.basic salary should be taken from user.
  if basic salary is greater than 1500,hra=20% and da=90% will e given else 
  hra=500 and da=70% given to the employee.*/

package oops;
import java.util.*;
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary: ");
		int bs=sc.nextInt();
		float hra,da;
		if(bs>1500)
		{
			hra=bs*0.2f;
			da=bs*0.9f;
		}
		else
		{
			hra=bs+500;
			da=bs*0.7f;
		}
		System.out.println("gross salary: "+(bs+hra+da));

	}

}
