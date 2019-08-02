package NormalPrograms;

public class PascalTriange2 {
	public static void main(String[] args) {
		int n = 10;
		int c = 1;
		// Printing Lines
		for (int i = 0; i < n; i++) {
			// Printing Spaces and required pyramid
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0) {
					c = 1;
				} else {
					c = c * (i - j + 1) / j;
				}
				System.out.print(" " + c);
			}
			System.out.println();
		}
	}
}
