import java.util.*;

public class iteratorImplementation{
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l);

        Iterator<Integer> it=l.iterator();

        while (it.hasNext()) {
            if(it.next()%2==0)
                it.remove();
            
        }
        System.out.println(l);

    }
}