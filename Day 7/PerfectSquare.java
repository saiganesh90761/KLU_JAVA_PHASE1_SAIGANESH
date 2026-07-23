import java.util.Scanner;

public class PerfectSquare {
	public static void PerfectSquare() {
		Scanner sc = new Scanner(System.in);
		boolean check=false;
		int n = sc.nextInt();
		for(int i = 1; i<=n/2; i++) {
			if(i*i==n) {
				check=true;
			break;
			}
		}
		if(check)System.out.print("Is a perfect square");
		else System.out.print("Not a perfect square");
	}
	public static void main(String[] args) {
		PerfectSquare();
	}

}
