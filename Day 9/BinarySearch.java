import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		int low=0,high=n-1,
				int t = sc.nextInt();
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
			
		}
while(low<high) {
		int mid = (low+high)/2;
		if(mid==t){
			int flag = 1;
			System.out.print("Present");
			break;
		}else if(mid<t)
			low=mid+1;
		else if(mid>t)
			high=mid-1;
	}
	if(flag==0)
		System.out.print("Not Present");
}
}
