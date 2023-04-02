import java.util.*;
public class RunningSumArray {
    public static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] rnums = new int[len];
        rnums[0]=nums[0];
        for(int i=1;i<len;i++){
            int temp=0;
            for(int j=0;j<=i;j++){
                temp=temp+nums[j];
            }
            rnums[i]=temp;
        }
        return rnums;
    }
    public static void main(String[] args){
        int[] n = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(n)));
    }
}
