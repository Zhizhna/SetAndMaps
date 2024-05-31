import java.util.*;

public class task4 {

    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        repeatFinder();
    }

    public static void repeatFinder(){

        Set<String> uniNums = new HashSet<>(strings);
        System.out.println(strings.size() - uniNums.size());
    }
}
