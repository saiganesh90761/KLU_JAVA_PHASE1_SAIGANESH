import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverse = "";
		for(int i = s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
		}
		if(reverse.equals(s)) {
			System.out.print("Palindrome");
		}else {
			System.out.print("Not Palindrome");
		}
//		System.out.print(reverse);
	}

}
