import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // args[0] for .csv file | args[1] for template.txt
        String csvFile = args[0];
        String tmpFile = args[1];

        // Map to store users (first row)
        Map<String, List<String>> users = new HashMap<>();
        List<String> allWords = new ArrayList<>();

        // To read lines in .csv and .txt files
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        Scanner scanner = new Scanner(tmpFile);

        // keys will be stored as array of string split by , first line
        String[] keys = br.readLine().split(",");

        String line;
        String word;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String key = values[0];
            List<String> list = users.getOrDefault(key, new ArrayList<>());
            list.addAll(Arrays.asList(Arrays.copyOfRange(values, 1, values.length)));
            users.put(key, list);
            // System.out.println(", key: " + key + " , list: " + list);
        }

        while (scanner.hasNext()) {
            word = scanner.next();
            System.out.println(word);
            allWords.add(word);
        }

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            for (String i : keys) {
                System.out.println(i);
            }
        }

        // Find <<key>> replace with values.

        // for (int i = 0; i < allWords.size(); i++) {

        // }
    }

}
