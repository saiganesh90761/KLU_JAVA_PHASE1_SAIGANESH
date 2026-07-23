import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            int c=0;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.print(i+" ");
            }
        }
	}
}