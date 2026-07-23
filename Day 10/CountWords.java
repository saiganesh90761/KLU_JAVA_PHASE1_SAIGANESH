import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int space = 0;
		for(char c : s.toCharArray()) {
			if(c==' ')
				space++;
		}
		System.out.print(space);
	}

}
