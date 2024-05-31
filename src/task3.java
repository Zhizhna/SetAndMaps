import java.util.*;

public class task3 {

    private static final List<String> words = new ArrayList<>(List.of("abc", "bcb","aba", "a"));

    public static void main(String[] args) {
        doubleFinder();
    }

    public static void doubleFinder(){
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
}
