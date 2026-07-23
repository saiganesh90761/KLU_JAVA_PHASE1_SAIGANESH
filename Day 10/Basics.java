import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String s = sc.nextLine();
//		System.out.println(s.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.charAt(0));
		for(char c : s.toCharArray()) {
			count++;	
		}
		System.out.println(count);
	}
}
