class encapsulation{
    int a;

    encapsulation() {
        a=10;
    }
    void display(){
        System.out.println("Implementation of encapsulation " +a);
    }
    
}

public class encapsulationimplementation{
    public static void main(String[] args) {
        encapsulation e=new encapsulation();
        e.display();
    }
}