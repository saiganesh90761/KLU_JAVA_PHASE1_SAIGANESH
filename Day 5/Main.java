import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int sq=n*n;
        while(sq!=0){
            int digit=sq%10;
            sum+=digit;
            sq=sq/10;
        }
        if(sum==n) System.out.print("The given number is a Neon number");
        else System.out.print("The given number is not a Neon number");
	}
}