import java.util.Scanner;

public class OddOrEven {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int odd = 0, even = 0;
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for(int i = 0; i<n; i++) {
//			arr[i] = sc.nextInt();
//			if(i%2==0)
//				even++;
//			else
//				odd++;
//		}
//		System.out.println("No of Even elemnets : " + even);
//		System.out.println("No of odd elemnets : " + odd);
//		
//		
//	}
//
//}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0,sum=0;
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(i%3==0&&i%2==0) {
				count++;
				sum+=arr[i];
				
			}
		}
		float avg = (float)sum/count;
		System.out.printf("%.2f",avg);
		
	}
	
}