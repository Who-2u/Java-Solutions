import java.util.Scanner;
public class invest {
    public static void main(String args[]) {
      int n,k;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      k=s.nextInt();
      int a=n;
      int[] amt=new int[n];
      for(int i= 0;i<n;i++){
          amt[i]=s.nextInt();
      }
      while(amt[0]<101){
          amt[a-1]-=100;
          a-=1;
          amt[a-1]+=100;
      }
      System.out.print(amt[n-1]-amt[0]);
    }
}
