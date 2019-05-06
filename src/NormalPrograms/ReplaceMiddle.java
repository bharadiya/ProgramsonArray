package NormalPrograms;

public class ReplaceMiddle {
	public static int[] replaceMiddle(int[] arr) {
		int[] newarr = new int[arr.length - 1];
		int temp = 0;
		int putvar = arr[(arr.length / 2) - 1] + arr[(arr.length / 2)];
		if (arr.length % 2 != 0) {
			return arr;
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				if (i == (arr.length / 2) - 1) {
					newarr[i] = putvar;
					temp = i;
					break;
				} else {
					newarr[i] = arr[i];
				}
			}
			int k = temp + 1;
			for (int i = temp + 2; i < arr.length; i++) {
				newarr[k] = arr[i];
				k++;
			}
		}
		return newarr;
	}

	public static void main(String[] args) {
		int[] a = { 7, 2, 2, 5, 10, 7 };
		for (int i : replaceMiddle(a)) {
			System.out.print(i + " ");
		}
	}
}
