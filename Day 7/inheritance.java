class parent{
    void display(){
        System.out.print("hello");
    }
}

class child extends parent{
    
}

public class inheritance{
    public static void main(String[] args) {
        parent p=new child();//->obect
        p.display();
        p.display1()
    }
}