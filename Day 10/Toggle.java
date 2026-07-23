import java.util.Scanner;


public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }else if(ch>='A'&&ch<='Z') {
            	ch=(char)(ch+32);
            }
            System.out.print(ch);
        }
    }
}