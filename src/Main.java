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

    }
}
