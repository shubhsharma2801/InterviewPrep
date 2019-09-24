package StringAlgo;

public class RotateMatrix {

	public RotateMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		printMatrix(mat);
		rotateMatrix(mat);
	}

	private static boolean rotateMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		int n= mat.length;
		for(int i=0;i<n/2;i++) {
			int first=i;
			int last=n-1-i;
			for(int j=first;j<last;j++) {
				//j=1
				//first=0
				//last=4
				//offset = 1
				int offset = j-first;
				int temp=mat[first][j];//2
				mat[first][j] = mat[last-offset][first];//mat[0][1] = mat[3][0]
				mat[last-offset][first] = mat[last][last-offset];
				mat[last][last-offset] = mat[j][last];
				mat[j][last] = temp;
			}
		}
		printMatrix(mat);
		return false;
		
		
	}

	private static void printMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
