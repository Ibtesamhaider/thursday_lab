//@author Ibtesam Haider
//substraction of two matrix
package thursday_lab1;

public class Substraction_Of_Matrix {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{8,9,7}}; //1st matrix
		int b[][]= {{2,4,6},{3,5,7},{1,3,5}}; //2nd matrix
		int arr[][]=new int[10][10];
		System.out.println("This is 1st Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" "); //print 1st matrix
			}
			System.out.println(" ");
		}
		System.out.println("This is 2nd Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" "); //print 2nd matrix
			}
			System.out.println(" ");
		}
		System.out.println("Substraction of two matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=a[i][j]-b[i][j]; //substracting two matrix
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
