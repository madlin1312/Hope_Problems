class Parent{
    void Top(){
        System.out.println("this is the parent class!");
    }
}

class child extends Parent{
    void First(){
        System.out.println("1st child of parent!");
    }
}
class secondchild extends child{
    void Second(){
        System.out.println("2nd child of parent!");
    }
}
public class inheritanceEx{
    public static void main(String[] args) {
        secondchild obj=new secondchild();
        obj.Top();
        obj.First();
        obj.Second();
    }
}