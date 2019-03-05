
import java.util.Comparator;
import java.util.TreeSet;

public class Compareclass implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if(i1<i2)
            return 1;
        else if (i1>i2)
            return -1;
        else
            return 0;
    }

    public static void main(String args[]){
        TreeSet<Integer> al = new TreeSet<>(new Compareclass());
        al.add(5);
        al.add(4);
        al.add(2);
        al.add(8);
        System.out.println(al);
    }
}


