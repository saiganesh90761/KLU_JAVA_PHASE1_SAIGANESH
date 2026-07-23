import java.util.Scanner;

public class SpeicficNumberDigits {
	static int digit() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		while(n!=0) {
			int digit = n%10;
			if(digit==d) {
				count++;
				n/=10;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int digit = digit();
		System.out.print(digit);
	}
}