package lib.cat.chapter1;
//转置矩阵
public class P1113 {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			int[] temp = new int[3];
			for (int j = i; j < 3; j++) {
				temp[j] = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp[j];
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
