//AUTHOR @ibtesam haider
package restaurant;
import java.util.*;
public class Restaurant_main {
	//static array for menu
		static Restaurant rest[]=new Restaurant[6];
		//static array for price
		static Price price[]=new Price[6];
		// blank array for menu & price
		static int[] nmenu = new int[6];
		static Scanner sc=new Scanner(System.in);
		static int index=0;
		static boolean quite=true;
		public void CreateMenu() {
			// create menu
			rest=new Restaurant[6];
			rest[0]=new Restaurant(1,"Biryani Combo");
			rest[1]=new Restaurant(2,"Chinese Combo");
			rest[2]=new Restaurant(3,"Bada Platter");
			rest[3]=new Restaurant(4,"Kebab Platter");
			rest[4]=new Restaurant(5,"Steam Momo (6 pics)");
			rest[5]=new Restaurant(6,"Panfried Momo(6 pics)");
			
			//create price
			price=new Price[6];
			price[0]=new Price(200);
			price[1]=new Price(350);
			price[2]=new Price(150);
			price[3]=new Price(250);
			price[4]=new Price(100);
			price[5]=new Price(120);
		}
		
		//value fetch blank array
		public static void getDisplay() {
			System.out.println("**********Welcome to Restrurant Management System**********\n");
			for(int i=0;i<nmenu.length;i++) {
				System.out.println((i+1)+". "+rest[i].getMenu()+"\t\t\t"+price[i].getPrice());
			}
		}
		//this method for oder
		public static void getOrder() {
			int id;
			do {
			System.out.print("\nDo you Want to order (y/n)?\t");
			String yn=sc.next();
			if(yn.equals("y")) {
				System.out.print("Eneter Menu id:- ");
				id=sc.nextInt();
				if(id>0 && id<=6) {
					//select menu
					for(int i=0;i<rest.length;i++) {
					if(i==id) {
						System.out.println("Menu Name is :- "+rest[i-1].getMenu());
					}
					}
					//oder quantity
					System.out.print("Enter the Quentity :- ");
					int qn=sc.nextInt();
					nmenu[id-1]+=qn;
					}
			}
			else {
				quite=false;
			}
			}while(quite);
		}
		
		//this method for billing
		public static void getBilling() {
			int sum=0;
			System.out.print("\n******************Yours orders are****************");
			for(int i=0;i<nmenu.length;i++)
		    {
	             if(nmenu[i]!=0)
		     {
		      sum+=nmenu[i]*price[i].getPrice();
		      //oder menu
		      System.out.println("\n"+rest[i].getMenu()+":- "+price[i].getPrice()+"*"+nmenu[i]+"="+nmenu[i]*price[i].getPrice()+" ruppes");
		     }
		    }
			System.out.println("\nYour Sub-total bill(Without GST) ="+sum+"");
			double sgst,cgst,a=sum,total;
			//for sgst
			sgst=a*5/100;
			System.out.println("\t\t       5% SGST :- "+sgst);
			//for cgst
			cgst=a*5/100;
			System.out.println("\t\t       5% SGST :- "+cgst);
			//total bill
			total=a+sgst+cgst;
			System.out.println("...........................................");
			System.out.println("Your total bill(With GST) :-      "+total);
			System.out.println("\n*****************Thank you visit us****************");
		}
	}

