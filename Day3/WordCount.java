package Day3;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String input = sc.nextLine().toLowerCase();
        sc.close();
        
        String[] words = input.split("[ ,;:.?!]+");
        Map<String, Integer> wordCount = new TreeMap<>();
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Number of words " + words.length);
        System.out.println("Words with the count");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
