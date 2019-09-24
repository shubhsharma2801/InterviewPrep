package StringAlgo;
import java.util.*;
public class CheckPermutation {
	public static void main(String args[]) {
		String s1="leet";
		String s2 ="lewt";
		Boolean isPermutation = checkPermutation(s1,s2);
		System.out.println(isPermutation);
	}
	private static Boolean checkPermutation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() != s2.length()) {
			return false;
		}
		System.out.println(s1);
		return sort(s1).equals(sort(s2));
	}
	public static String sort(String stringToSort) {
		char[] charS1 =stringToSort.toCharArray();
		Arrays.sort(charS1);
		System.out.println(charS1.toString());
		return String.valueOf(charS1);
	}
	public CheckPermutation() {
		// TODO Auto-generated constructor stub
		
	}

}
