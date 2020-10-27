package searching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Searching {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\dev_corndel\\algorithms\\src\\main\\java\\searching\\words.txt"));
        List<String> lines = new ArrayList<String>();
        String line;

        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        System.out.println("Generated words list");
        reader.close();

        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            String random = lines.get(rand.nextInt(lines.size()));
            linearSearch(lines, random);
            binarySearch(lines, random);
        }


    }

    public static void linearSearch(List<String> wordList, String target) {
        long start = System.currentTimeMillis();
        for (String i: wordList) {
            if (i.equals(target)) {
                long end = System.currentTimeMillis();
                System.out.println("Linear search on " + target + " took " + (end - start) + "ms");
                return;
            }
        }
    }

    public static void binarySearch(List<String> wordList, String target) {
        long start = System.currentTimeMillis();

        int highest = wordList.size() - 1;
        int mid = highest / 2;
        int lowest = 0;

        while (!wordList.get(mid).equals(target)) {
            if (wordList.get(mid).compareTo(target) > 0) {
                highest = mid - 1;

            } else {
                lowest = mid + 1;
            }

            mid = lowest + (highest - lowest) / 2;
        }

        long end = System.currentTimeMillis();
        System.out.println("Binary search on " + target + " took " + (end - start) + "ms");
    }
}
