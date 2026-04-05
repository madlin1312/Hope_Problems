class crOverloading{
    crOverloading() {
        System.out.println("This is default constructor");
    }
    crOverloading(int a) {
        System.out.println("This is parameterized constructor with one parameter");
    }
    crOverloading(String str) {
        System.out.println("This is parameterized constructor with one String parameter");
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
        System.out.println("constructor Overloading");
        crOverloading cr1 = new crOverloading();                   
        crOverloading cr2 = new crOverloading(5);               
        crOverloading cr3 = new crOverloading("Hello");        
    }
}