package StringAlgo;

import java.util.HashMap;
import java.util.Map;

public class Pallindrome {

	public Pallindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="dod";
		Boolean ans = checkPallindrome(input.toCharArray());
		System.out.println(ans);
	}

	private static Boolean checkPallindrome(char[] cs) {
		// TODO Auto-generated method stub
		Map<Character,Integer> mapcharvscount = new HashMap<Character, Integer>();
		int oddCount=0;
		
		for(int i=0;i<cs.length;i++) {
			if(cs[i] == ' ') {
				continue;
			}
			if(mapcharvscount.containsKey(cs[i])) {
				int count = mapcharvscount.get(cs[i]);
				mapcharvscount.put(Character.toLowerCase(cs[i]), ++count);
				if(count % 2==0) {
					oddCount--;
				}else {
					oddCount++;
				}
				
			}else {
				mapcharvscount.put(Character.toLowerCase(cs[i]), 1);
				oddCount++;
			}
		}
		System.out.println(mapcharvscount);
		return oddCount<=1;
	}

}
