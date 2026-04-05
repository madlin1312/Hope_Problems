import java.util.*;
public class lc121{
    public static void main(String[] args) {
        int pos=0;
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int[] arr={7,1,5,3,6,4};
        int[] nums=arr.clone();
        Arrays.sort(nums);
        for(int i=0;i<6;i++){
            if(arr[i]==nums[0]){
                pos=i;
            }
        }
        for(int i=pos;i<6;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max +" "+nums[0]);

    }
}