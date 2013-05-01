package lib.cat.chapter1;

//输入一个整数，将其转换成二进制打印
import java.util.Scanner;

public class P1109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		/*String s = Integer.toBinaryString(num);*/
		
		String s = "";
		for(int n = num; n>0; n/=2) {
			s = ( n % 2 ) + s;
		}
		System.out.println(s);
	}
}
