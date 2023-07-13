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
https://www.linkedin.com/e/v2?e=bjrqhf-lk0u8p6d-vw&lipi=urn%3Ali%3Apage%3Aemail_email_security_learning_one_time_sign_in_01%3BQOQvhYnBQtGDoRCBFn1lhw%3D%3D&a=checkpoint-otp-submit&midToken=AQGfnPxFsYfURw&midSig=0klNTu_fMGCaQ1&ek=email_security_learning_one_time_sign_in_01&sig=3nD4Q17z8GCaQ1&submissionId=AgHlu0zNPR2ebQAAAYlOL47zG9afqE86b3iHE8sKLAVnXb53OvkkSm2hdRCOt7pv-Kkpy7Ph9Je8uiXptXIzadY8X6MkgXzBqGreNw&loginToken=AQGV4Zn4T9phrwAAAYlOL49boyYBR94tGLoVr4duzI8pJcw0E-Bmcq7Qys8sRI2e0XuL7NrqKRUuNJ2Y3gUex9ZRxfDG0qPnTBd8lFah&sessionRedirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Flearning-login%2Fcontinue%3Faccount%3D2141490%26authUUID%3D%252Fx7vUbHsQuyLzIWN%252FYH4VA%253D%253D%26forceAccount%3Dfalse%26lastLoginStep%3DLOGIN_MEMBER%26loginStepRetryCount%3D0%26redirect%3Dhttps%253A%252F%252Fwww%252Elinkedin%252Ecom%252Flearning%252Fhow-to-use-linkedin-learning%253FdApp%253D50502294%2526leis%253DLAA%2526u%253D2141490%26forceActivation%3Dfalse%26parentPageKey%3Dd_checkpoint_lg_consumerLogin_learning_login%26linkType%3DOTP_LOGIN_PROFILE_LINK&fromSignIn=true&trk=learning_login
