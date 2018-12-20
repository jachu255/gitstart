import com.jan255.*;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");

        System.out.println("Hello World! "+listWithNames.size());

        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Marcin");
        setWithNames.add("Marek");

        Numer1 x = new Numer1();
        Numer2 y = new Numer2();
        System.out.println(x.nr1());

    }
}
