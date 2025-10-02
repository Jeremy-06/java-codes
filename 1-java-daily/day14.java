import java.util.ArrayList;
import java.util.List;

public class day14 {
    public static void main(String[] args) {
        System.out.println("Using ArrayList");
        List<String> name = new ArrayList<>();

        name.add("Alice");
        name.add("Bob");
        name.remove("Alice");
        name.get(0);
        System.out.println(name);
    }
}
