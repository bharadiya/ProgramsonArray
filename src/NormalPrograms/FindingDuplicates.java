package NormalPrograms;

import java.util.Arrays;

public class FindingDuplicates {
	public static void main(String[] args) {
		int[] arr = { -1,1, 2, 1, 2, 1, 3, 3, 1, 4, 5, 6, 7, -1, -1, -1, -2, -2 };
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				continue;
			} else {
				count++;
			}
		}
		int[] newarr = new int[count + 1];
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				continue;
			} else {
				newarr[k] = arr[i];
				newarr[k + 1] = arr[i + 1];
				k++;
			}
		}
		for (int i : newarr) {
			System.out.print(i + " ");
		}
	}
}
