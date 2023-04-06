import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Integer> nums = generateInts(20);
        System.out.println("Сгенерированные числа: " + nums);
        task1(nums);
        task2(nums);
        task3(List.of("test", "test","Test","TEST","TES","test"));
        task4(List.of("test", "test","Test","TEST","TES","test","TEST"));
    }
    private static void task1(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.println( number + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }
    private static void task2(List<Integer>nums) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }

    private static void task3(List<Integer> nums) {
        System.out.println("Задача 3");
        for (String word : words) {
            if (Collections.frequency(words,word) == 1){
                System.out.println(word + " ");
                }
            }
            System.out.println();
            System.out.println("----------------------------");
    }
    private static void task4 (List < Integer > nums) {
        System.out.println("Задача 4");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int wordsWithoutDublicates = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();
            if (count > 1) {
            }
        }
        System.out.println();
        System.out.println("----------------------------");
    }
    private static List<Integer> generateInts(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0, i < n; i++ ){
            list.add(RANDOM.nextInt(5));
                }
        return list;
    }
}