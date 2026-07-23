import java.util.Scanner;

public class AutomarphicNumber {
	public static int count(int n) {
		int count=0;
		while(n!=0)	{
			count++;
			n/=10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digits = count(n);
		int sq=n*n;
		int num=(int) Math.pow(10, (double)digits);
		int lastdigits=sq%num;
		if(lastdigits==n) System.out.print("Automorphic number");
		else System.out.print("Not automorphic");
	}

}
