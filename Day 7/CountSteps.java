import java.util.Scanner;

public class CountSteps {
	static int NumberOfSteps(int n) {
		int count = 0;
		
			while(n!=0) {
				if(n%2==0)
				n/=2;
			else
				n=n-1;
				count++;
			}
			return count;
			
		}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int result=NumberOfSteps(n);
	System.out.print(result);
}
}
