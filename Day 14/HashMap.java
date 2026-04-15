public class HashMap{
    public static void main(String[] args) {
        String s="   i am lazy   ";
        String s1=s.replaceAll("\\s+"," ");
        String s2=s1.trim();
        String[] arr=s2.split(" ");
        for(int i=0;;i++){
            System.out.println(arr[i]);
        }



    }
}