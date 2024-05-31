import java.util.*;

public class task12 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        System.out.print("\n");
        printEvenUniNumbers(nums);
    }

    public static void printOddNumbers(List<Integer> numbers) {

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number);
            }
        }
    }

    public static void printEvenUniNumbers(List<Integer> numbers) {

        Set<Integer> uniNums = new HashSet<>();

            for(Integer number : numbers) {
                if (number % 2 == 0) {
                    uniNums.add(number);
                }
            }

            List<Integer> sortNums = new ArrayList<>(uniNums);
            Collections.sort(sortNums);

            for(Integer number : sortNums){
                System.out.print(number);
            }
    }
}