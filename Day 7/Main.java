import java.util.Scanner;

public class Main {
	public static void square() {
		int p,b,ans=1;
		Scanner sc = new Scanner(System.in);
		p=sc.nextInt();
		b=sc.nextInt();
		while(p!=0) {
			ans=ans*b;
			p--;
		}
		System.out.print(ans);
		
			
		}
	public static void main(String[] args) {
		square();
		
	}

}
