
public class Ascending {
	public static void main(String[] args) 
	// comment added checked
	//Sort an array into ascending order
	{
		int[] arr = { 10, 9, 8, 6, 3, 11, 11, 11, 1, 1, 9, 8, 7 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j+1];
                        		arr[j+1] = arr[j] - arr[j+1];
                        		arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		//Printing array elements
		for (int i = 0; i < arr.length - 1; i++) {
                System.out.println(arr[i]);
            	}
	}
} // this comment to check conflicts
