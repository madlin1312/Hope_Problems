public class tenPrime {

    public static void main(String[] args){
        int c=0;
        int count=0;
        for(int i=1;c<10;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
                c++;
            }
            count=0;
        }
    }
}