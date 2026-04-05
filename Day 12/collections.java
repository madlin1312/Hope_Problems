import java.util.*;
public class collections{
    public static void main(String[] args) {
        ArrayList<Integer> arrList=new ArrayList<>();
        arrList.add(null);
        arrList.add(10);
        arrList.add(20);
        arrList.set(1,0);
        arrList.add(3,30);
        System.out.println(arrList);
        System.out.println(arrList.get(1));
        arrList.remove(1);
        System.out.println(arrList.contains(10));
        System.out.println(arrList.contains(20));
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.add(40);
        arrList.add(40);
        System.out.println(arrList);
        System.out.println(arrList.indexOf(40));
        System.out.println(arrList.lastIndexOf(40));
        System.out.println(arrList.isEmpty());
        arrList.clear();
        System.out.println(arrList);
        System.out.println(arrList.isEmpty());

        
    }
}