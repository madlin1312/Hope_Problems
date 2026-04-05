abstract class Animals{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animals{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animals{
    void sound(){
        System.out.println("Meows");
    }
}

public class Abstarction{
    public static void main(String[] args){
        
    }
}