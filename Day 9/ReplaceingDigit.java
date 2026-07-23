import java.util.Scanner;

public class ReplaceingDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) 
			arr[i] = sc.nextInt();
			int index = sc.nextInt();
			int value = sc.nextInt();
			arr[index] = value;
			for(int x : arr) 
				System.out.print(x + " ");
			
		
		
	

}
}
