import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String csvFile = args[0];
        String tmpFile = args[1];

        Map<String, List<String>> users = new HashMap<>();
        
        BufferedReader br = new BufferedReader(new FileReader(csvFile));

        String[] keys = br.readLine().split(",");

        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String key = values[0];
            List<String> list = users.getOrDefault(key, new ArrayList<>());
            list.addAll(Arrays.asList(Arrays.copyOfRange(values, 1, values.length)));
            users.put(key, list);
            // System.out.println(", key: " + key + " , list: " + list);
        }

        for (String i : keys) {
            System.out.println(i);
        }

    }
}
