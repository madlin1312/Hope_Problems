class parent{
    void display(){
        System.out.println("I am inside parent class.");
    }
}
class child extends parent{
    void display1(){
        System.out.println("I am inside child class.");
    }
}

public class simpleInheritance{
    public static void main(String[] args){
        child c=new child();
        c.display();
        c.display1();
    }
}