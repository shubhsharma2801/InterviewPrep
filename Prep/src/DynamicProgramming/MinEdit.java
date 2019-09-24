package DynamicProgramming;

public class MinEdit {

	public MinEdit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "benyam";
		String s2 ="ephrem";
		int minEdit = minEdit(s1,s2);
		System.out.println(minEdit);
		
	}

	private static int minEdit(String s1, String s2) {
		// TODO Auto-generated method stub
		int T[][] = new int[s1.length()+1][s2.length()+1];
		//T[0][0]=0;
		for(int i=0;i<T[0].length;i++) {
			T[0][i] = i;
		}
		for(int i=0; i<T.length;i++) {
			T[i][0] = i;
		}
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				 if(s1.charAt(i-1) == s2.charAt(j-1)) {
					T[i][j] = T[i-1][j-1];
				}else {
					T[i][j] = 1+ min(T[i-1][j-1], T[i-1][j],T[i][j-1]);
				}
			}
		}
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				System.out.print(T[i][j]+"      ");
			}
			System.out.println();
		}
		return 0;
	}
	private static int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
}
