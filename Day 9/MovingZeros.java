import java.util.Scanner;

public class MovingZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int left=0, right=n-1;
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		while(left<right) {
			while(left<right && arr[left]==0)
				left++;
			while(left<right && arr[right]==1)
				right--;
			if(left<right) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;  
				left++;
				right--;
			}
		}
		for(int i= 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
//int i,zc=0,oc=0;
//for(i=0;i<n;i++) {
//	arr[i]=sc.nextInt();
//if(arr[i]==0)
//	zc++;
//}
//for(i =0; i<zc; i++)
//	arr[i]=0;
//for(i = zc; i<n; i++)
//	arr[i] = 1;
//for(i=0; i<n; i++)
//	System.out.print(arr[i] + " ");
//}
//}
//012
//int i,zc=0,oc=0;
//for(i=0;i<n;i++) {
//	arr[i]=sc.nextInt();
//if(arr[i]==0)
//	zc++;
//}
//for(i =0; i<zc; i++)
//	arr[i]=0;
//for(i = zc; i<zc+oc; i++)
//	arr[i] = 1;
//for(i = zc+oc; i<n; i++)
//arr[i] = 2;

//for(i=0; i<n; i++)
//	System.out.print(arr[i] + " ");
//}
//}

















