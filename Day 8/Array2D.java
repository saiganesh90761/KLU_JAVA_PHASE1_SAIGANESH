import java.util.Scanner;

//public class Array2D {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		int arr[][] = new int[row][col];
//		int sum = 0;
//		for(int i = 0; i<row; i++) {
//			for(int j = 0; j<col; j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i = 0; i<row; i++) {
//			System.out.println();
//			for
//		}
//	}
//
//}
//primary & Secondary

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int n  = sc.nextInt(); 
		int arr[][] = new int[row][col];
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Primary Digits: ");
		for(int i = 0; i<n; i++)  
			System.out.print(arr[i][i] + " ");
		
		System.out.print("Secondary Digits: ");
		System.out.println();
		for(int i = 0; i<n; i++) 
			System.out.print(arr[i][n-1-i] + " ");
	}
}