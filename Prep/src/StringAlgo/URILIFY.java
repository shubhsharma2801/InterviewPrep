package StringAlgo;

public class URILIFY {

	public URILIFY() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Mr John Smith            ";
		String urliifiedString= replaceSpaces(str.toCharArray(),13);
		System.out.println(urliifiedString);
	}

	private static String replaceSpaces(char[] str, int trueLength) {
		// TODO Auto-generated method stub
		int spaceCount =0;
		for(int i=0;i<trueLength;i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		//we have multiplied it by 2 because one space is already present in the string and we need space for two character
		int index = trueLength+ spaceCount*2;
		
		if(trueLength < str.length) str[trueLength]='\0';
		System.out.println(str.length);
		for(int i=trueLength-1;i>=0;i--) {
			if(str[i] == ' ') {
				str[index -1] = '0';
				str[index -2] = '2';
				str[index -3] = '%';
				index= index-3;
			}else {
				str[index -1 ]=str[i];
				index--;
			}
		}
		return String.valueOf(str);
	}

}
