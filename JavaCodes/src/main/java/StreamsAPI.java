import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAPI {

    public static void main(){
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<10;i++){
            l1.add(i);
        }
        Stream<Integer> s1 = l1.stream();
        s1.forEach(s->System.out.println(s));

    }


}
