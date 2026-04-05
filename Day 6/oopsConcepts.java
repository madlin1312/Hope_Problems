class Apartment{
    void display(){
        System.out.println("I am inside the apartment");
    }
}

public class oopsConcepts{
    public static void main(String[] args){
        System.out.println("I am inside class Objects");
        Apartment apartment=new Apartment();
        apartment.display();
    }
}