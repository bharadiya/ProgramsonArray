import java.util.Arrays;

public class OddEvenSorting {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };
		int evens = 0; // counters
		int odds = 0; // counters
		int j = 0;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evens++;
			} else {
				odds++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				evens++;
			} else {
				odds++;
			}
		}
		System.out.println(evens + " " + odds);
		int[] even = new int[evens];
		int[] odd = new int[odds];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even[j] = a[i];
				j++;
			} else {
				odd[k] = a[i];
				k++;
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				even[j] = b[i];
				j++;
			} else {
				odd[k] = b[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}
}
