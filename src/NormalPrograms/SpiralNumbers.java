package NormalPrograms;

public class SpiralNumbers {
	public static int[][] spiralNumbers(int n) {
		int i = 0;
		int j = 0;
		int num = 1;
		int[][] m = new int[n][n];
		for (int l = n; l >= 2; l -= 2) {
			for (j = (n - l) / 2; j < n - 2; j++) {
				m[(n - l) / 2][j] = num;
				num++;
			}
			for (i = (n - l) / 2; i < l - 1; i++) {
				m[i][l-1] = num;
				num++;
			}
			for (j = l - 1; j >= 1; j--) {
				m[l - 1][j] = num;
				num++;
			}
			for (i = l - 1; i >= 1; i--) {
				m[i][(n - l) / 2] = num;
				num++;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		for (int i = 0; i < spiralNumbers(6).length; i++) {
			for (int j = 0; j < spiralNumbers(6)[i].length; j++) {
				System.out.print(spiralNumbers(6)[i][j] + " ");
			}
			System.out.println();
		}
	}
}
