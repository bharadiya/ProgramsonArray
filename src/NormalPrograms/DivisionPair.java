package NormalPrograms;

public class DivisionPair {
	public static int divisorsPairs(int[] s) {
		int count = 0;
		for (int d = 0; d < s.length - 1; d++) {
			for (int i = d + 1; i < s.length; i++) {
				if (s[i] % s[d] == 0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] s = { 1, 3, 2, 4, 5, 8 };
		System.out.println(divisorsPairs(s));
	}
}
