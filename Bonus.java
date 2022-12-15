/*wap to calculate bonus.if employee is serving in organization for more than 3 years bonus=2500 will
 be given to employee.*/
package oops;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the current year: ");
		int current_year=sc.nextInt();
		System.out.println("enter the year of joining: ");
		int joining_year=sc.nextInt();
		int diff=current_year-joining_year;
		if(diff>3)
		{
			System.out.println("bonus of 2500");
		}
		else
		{
			System.out.println("no bonus");
		}

	}

}
