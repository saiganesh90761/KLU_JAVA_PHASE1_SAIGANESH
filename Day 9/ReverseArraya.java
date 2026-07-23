import java.util.Scanner;

public class ReverseArraya {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for(int i = 0; i<n; i++) {
//			arr[i] = sc.nextInt();
//			
//		}
//		for(int i = n-1; i>=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//
//}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp=arr[0];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int left=0,right=n-1;
		while(left<=right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i = 0; i<n; i++)
		System.out.print(arr[i] + " ");
	}
}