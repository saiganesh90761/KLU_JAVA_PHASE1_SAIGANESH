import java.util.Scanner;

public class SearchingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0; i<n; i++) 
				arr[i] = sc.nextInt();
				int value = sc.nextInt();
				for(int i = 0; i<n; i++)
					
				if(value == arr[i]) {
					check = true;
					break;
				}
				
			if(check) {
				System.out.print("Present");
			}else {
				System.out.print("Not Present");
			}
				
		}
	}


