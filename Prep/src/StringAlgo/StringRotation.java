package StringAlgo;

public class StringRotation {

	public StringRotation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean isRotation = checkRotation("waterbottle","rbottlewate");
		System.out.println(isRotation);
	}

	private static Boolean checkRotation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == s2.length() && s1.length() >0) {
			String s1s1 =s1+s1;
			return s1s1.contains(s2);
		}
		return null;
	}

}
