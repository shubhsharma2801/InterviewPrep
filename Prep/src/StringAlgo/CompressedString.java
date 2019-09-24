package StringAlgo;

public class CompressedString {

	public CompressedString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenString ="aabcccaaaa";
		String compressedString= getCompressedString(givenString);
		System.out.println(compressedString);
	}

	private static String getCompressedString(String s1) {
		// TODO Auto-generated method stub
		StringBuilder compressed = new StringBuilder();
		int countString=0;
		for(int i=0;i<s1.length();i++) {
			countString++;
			if(i+1 >= s1.length() || s1.charAt(i) != s1.charAt(i+1)) {
				compressed.append(s1.charAt(i));
				compressed.append(countString);
				countString=0;
				
			}
		}
		
		return compressed.length() < s1.length() ?compressed.toString() :s1;
	}

}
