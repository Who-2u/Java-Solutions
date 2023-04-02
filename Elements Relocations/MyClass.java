public class MyClass {
    public static int solution(int A[]){
        int partial = 0;
        int moves = 0;
        for(int n: A){
            if(partial==0){
                if(n>0)
                partial=n;
                else
                moves+=1;
            }
            else{
                if(n>0)
                partial+=n;
                else if(partial+n<=0)
                moves+=1;
        
            }
        }
    return moves;
        
    }
    public static void main(String args[]) {
      int[][] tests={{1,-10,-1,-1,10},{-1,-1,-1,1,1,1,1},{5,-2,-3,1}};
      for (int[] u: tests) {
        System.out.println(solution(u));
      }
    }
}