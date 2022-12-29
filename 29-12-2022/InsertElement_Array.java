//@author Ibtesam Haider
//insert a new element in specific position within an array
package thursday_lab1;

public class InsertElement_Array {

	public static void main(String[] args) {
		int a[]={2,3,5,6,7};
		int x=3;//index position to insert element
		int y=4;//declaring element to insert
		int z=a.length;
		for(int i=z-1;i>x-1;i--)
		{
			a[i]=a[i-1];
		}
		a[x-1]=y;
	for(int i=0;i<z;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}
