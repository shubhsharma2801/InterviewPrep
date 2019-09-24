package StringAlgo;

public class OneAway {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean isOneAway= checkIsOneAway("pale".toCharArray(),"sale".toCharArray());
		System.out.println(isOneAway);
	}

	private static Boolean checkIsOneAway(char[] charArray, char[] charArray2) {
		// TODO Auto-generated method stub
		int m= charArray.length;
		int n = charArray2.length;
		int i=0;
		int j=0;
		int count = 0;
		System.out.println(i<m && n<j);
		while(i<m && j<n) {
			
			if(count > 1) {
				return false;
			}
			if(charArray[i] != charArray2[j]) {
				if(m>n) {
					i++;
					//count ++;
				}else if(n>m) {
					j++;
					//count++;
				}else {
					i++;
					j++;
					//count++;
				}
				count++;
			}else {
				i++;
				j++;
			}
			
		}
		if(i<m || j<n) {
			return true;
		}
		return count == 1;
		
	}

	

}
