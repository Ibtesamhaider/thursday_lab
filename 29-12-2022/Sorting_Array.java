//@author Ibtesam Haider
//Sort the array elements
package thursday_lab1;
import java.util.*;
public class Sorting_Array {

	public static void main(String[] args) {
		int arr[]=new int[] {7,9,4,5,10,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int t=0;
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			System.out.print(" "+arr[i]);
		}
		}
}

