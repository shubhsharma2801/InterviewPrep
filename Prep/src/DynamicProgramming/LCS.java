package DynamicProgramming;

public class LCS {

	public LCS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        int resultDyn = lcsDynamic(str1,str2);
        int result = lcsRecursive(str1,str2,1,1);
        System.out.println(result);
        System.out.println(resultDyn);
	}
	private static int lcsRecursive(String str1,String str2,int i,int j) {
		if(i==str1.length() || str2.length()==j) {
			return 0;
		}else if(str1.charAt(i)==str2.charAt(j)){
			return 1+ lcsRecursive(str1,str2,i+1,j+1);
		}else {
			return Math.max(lcsRecursive(str1,str2,i+1,j), lcsRecursive(str1,str2,i,j+1));
		}
	}
	private static int lcsDynamic(String str1, String str2) {
		// TODO Auto-generated method stub
		int T[][] = new int[str1.length()+1][str2.length()+1]; 
		int max=0;
		for(int i=1;i<str1.length();i++) {
			for(int j=1;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					T[i][j]=T[i-1][j-1]+1;
				}else {
					T[i][j]=Math.max(T[i-1][j], T[i][j-1]);
				}
				if(T[i][j] > max){
                    max = T[i][j];
                }
			}
		}
		
		return T[str1.length()-1][str2.length()-1];
	}

}
