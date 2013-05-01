package lib.cat.chapter1;

//生成二维布尔数组，并打印。打印时用*表示真，用空格表示假
import java.util.Scanner;

public class P1111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the M of Matrix: ");
		int m = sc.nextInt();
		System.out.println("Input the N of Matrix: ");
		int n = sc.nextInt();
		boolean[][] matrix = generate_boolean_matrix(m, n);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				double temp = Math.random();
				if(matrix[j][i] == true) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static boolean[][] generate_boolean_matrix(int m, int n) {
		boolean[][] matrix = new boolean[m][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				double temp = Math.random();
				if(temp >= 0.5) {
					matrix[j][i] = true;
				}
				else {
					matrix[j][i] = false;
				}
			}
		}
		return matrix;
	}
}
