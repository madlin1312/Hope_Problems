import java.util.*;
public class linkedlist{
    public static void main(String[] args) {
        List<String> runningrace=new LinkedList<>();
        runningrace.add("A");
        runningrace.add("B");
        runningrace.add("C");
        System.out.println(runningrace);
        runningrace.addFirst("startrace");
        System.out.println(runningrace);
        runningrace.remove("B");
        System.out.println("B is Disqualified");
        System.out.println(runningrace);
        System.out.println("A won the race");
        System.out.println("Race is completed!!");
        runningrace.clear();
        System.out.println(runningrace);

    }
}