import java.util.Arrays;

public class Position {
	public static int[] solution(String[] A,int M,int N) {	
		int f=0,l=0,charpos=0;	
		for(int i =0;i<N;i++) {	
			for(int j=i+1;j<N;j++) {	
				for(int k =0;k<M;k++) {
					String s1=A[i];
					String s2=A[j];
					if(s1.charAt(k)==s2.charAt(k)) {
						charpos=k;
						f=i;
						l=j;
						break;
					}
				}
			}
		}
		int[] result= {f,l,charpos};
		return result;
	}

	public static void main(String[] args) {
		String[] str= {"abc","bda","dbv"};
		int m=3,n=3;
		System.out.print(Arrays.toString(solution(str,m,n)));
	}

}