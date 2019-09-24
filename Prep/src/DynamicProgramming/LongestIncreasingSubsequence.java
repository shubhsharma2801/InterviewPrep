package DynamicProgramming;

public class LongestIncreasingSubsequence {

	public LongestIncreasingSubsequence() {
		// TODO Auto-generated constructor stub
	}
	public static int lisDyn(int[] arr) {
		int[] T = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			T[i]=1;
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && T[j] + 1> T[i]) {
					T[i] = T[j]+1;
				}
			}
		}
		int maxIndex =0;
		for(int i=0;i<T.length;i++) {
			if(T[i] >T[maxIndex]) {
				maxIndex =i;
			}
		}
		return T[maxIndex];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,10,22,5,33,8,9,21,50,41,60,80,99, 22,23,24,25,26,27};
		System.out.println(lisDyn(arr));
	}

}
