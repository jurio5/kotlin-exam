import java.util.ArrayList;
import java.util.List;

public class JMain {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("Alice");
        name.add("Bob");

        for (String names : name) {
            System.out.println(names);
        }
    }
}
