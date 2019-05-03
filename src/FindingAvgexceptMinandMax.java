import java.util.Arrays;
import java.util.Collections;

public class FindingAvgexceptMinandMax {
	public static void main(String[] args) {
		Integer[] arr = { 2, 2, 2, 2, 3, 1 };
		int sum = 0;
		double avg = 0;
		int count = 0;
		int max = Collections.max(Arrays.asList(arr));
		int min = Collections.min(Arrays.asList(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max || arr[i] == min) {
				count++;
				continue;
			} else {
				sum += arr[i];
			}
		}
		avg = (double) sum / (arr.length - count);
		System.out.println(avg);

//		int sum = 0;
//		double avg = 0;
//		int count = 0;
//		int temp1 = 0;
//		int temp2 = 0;
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] == arr[i + 1]) {
//				count++;
//			} else {
//				temp1 = i;
//				break;
//			}
//		}
//		for (int i = arr.length - 1; i > 0; i--) {
//			if (arr[i] == arr[i - 1]) {
//				count++;
//			} else {
//				temp2 = i;
//				break;
//			}
//		}
//		count = count + 2;
//		for (int i = temp1 + 1; i <= temp2 - 1; i++) {
//			sum += arr[i];
//		}
//		avg = (double) sum / (arr.length - count);
//		System.out.println(avg);
	}
}
