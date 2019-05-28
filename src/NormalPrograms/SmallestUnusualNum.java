package NormalPrograms;

import java.math.BigInteger;

public class SmallestUnusualNum {
	public static int smallestUnusualNumber(String a) {
		BigInteger temp = new BigInteger(a);
		BigInteger b = new BigInteger(a);
		BigInteger one = new BigInteger("1");
		for (int i = 1; true; i++) {
			if (i > 1) {
				b = b.add(one);
				if (doAddition(b.toString()) > doMultiplication(b.toString())) {
					break;
				}
			} else {
				if (doAddition(b.toString()) > doMultiplication(b.toString())) {
					break;
				}
			}
		}
		return Integer.parseInt(b.subtract(temp).toString());
	}

	public static int doAddition(String s) {
		int addition = 0;
		for (char c : s.toCharArray()) {
			if (c != '0')
				addition += c - '\u0030';
		}
		return addition;
	}

	public static int doMultiplication(String s) {
		int mul = 1;
		for (char c : s.toCharArray()) {
			mul *= c - '\u0030';
		}
		return mul;
	}

	public static void main(String[] args) {
		System.out.println(smallestUnusualNumber("8888888888888888888888888888888"));
	}
}
