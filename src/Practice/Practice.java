package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		int [] a = { 1, 2, 3, 4, 5 };
		Integer[] what = Arrays.stream( a ).boxed().toArray( Integer[]::new );
		List<Integer>al=Arrays.asList(what);
		System.out.println(Collections.max(al));
	}
}
