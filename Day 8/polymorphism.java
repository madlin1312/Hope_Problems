class Addition{
    int a,b,c;
    void add1(int a,int b){
        System.out.println("Sum of a and b:"+(a+b));
    }
    void add1(int a,int b,int c){
        System.out.println("Sum of a b and c:"+(a+b+c));
    }
}

public class polymorphism{
    public static void main(String[] args) {
        Addition ad1=new Addition();
        Addition ad2=new Addition();
        ad1.add1(2,3);
        ad2.add1(1,2,3);
    }
}