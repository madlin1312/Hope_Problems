class Student{
    String name;
    String rollno;
    Student(String name,String rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name: "+name+"\nRollno: "+rollno);
    }
    
}            

public class thisKeyword{
    public static void main(String[] args) {
        Student s1=new Student("Lingesh","24ec178");
        Student s2=new Student("Kopi","24ec814");
        s1.display();
        s2.display();
    }
}