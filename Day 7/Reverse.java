import java.util.Scanner;

public class Reverse {
	static int reverse(int n) {
	int reverse = 0,rev1=0;
	
	while(n!=0) {
		int digit = n%10;
		reverse = reverse*10+digit;
		n=n/10;
	}
	while(reverse!=0) {
		int digit = reverse%10;
		rev1=rev1*10+digit;
		reverse/=10;
	}
	return rev1;

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev1 = reverse(n);
		if(n==rev1)
		System.out.print("true");
		else
			System.out.print("false");
	}
}
