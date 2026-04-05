import java.util.*;
public class perfectNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();
        int sum=0;
        int num=Integer.valueOf(number);
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num +"is a perfectnumber!");
        }else{
            System.out.println(num +"is not a perfectnumber");
        }
    }
}