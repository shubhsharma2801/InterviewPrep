package StringAlgo;

public class BruteForce {
	
	public static void main(String args[]) {
		int T[] = new int[] {1,1,2,1,3,1,1,2,1,1};
		int P[]= new int[] {1,2,1};
		int i= bruteForceStringSearch(T,T.length,P,P.length);
		System.out.println("String matched at position "+i);
	}

	private static int bruteForceStringSearch(int[] t, int n, int[] p, int m) {
		for(int i=0;i<=n-m;i++) {
			int j=0;
			System.out.println("p[j] at "+j+" value "+p[j]);
			System.out.println("t[i+j] at "+(i+j)+" value "+t[i+j]);
			while(j<m && p[j]==t[i+j] ) {//j<m is added to avoid arrayindexoutofbound
				System.out.println();
				System.out.println("p[j] at "+j+" value "+p[j]);
				System.out.println("t[i+j] at "+(i+j)+" value "+t[i+j]);
				j=j+1;
			}
			if(j==m) {
				return i;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}
}
