import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("Vinesh");
        list.add("Vinay");
        list.add("Vin");

        for(String item:list){
           System.out.println(item);
        }

        list.forEach(item-> System.out.println(item));


    }
}
