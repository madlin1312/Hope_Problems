import java.util.*;
public class findLeader{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter n:");
        int n=sc.nextInt();
        int found=0,k=0;
        int[] nums=new int[n];
        int[] arr=new int[n];
        System.out.println("Eneter elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            found=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    found=0;
                }else{
                    found =1;
                    break;
                }
                
                }if(found==0){
                    arr[k]=nums[i];
                    k++;
            }
        }arr[k]=nums[n-1];
        System.out.println("leader elements:");
        for(int i=0;i<k+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}