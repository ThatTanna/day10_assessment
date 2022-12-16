import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {
    public static final void main(String[] args) throws Exception {

        String csvFile = args[0];
        String tmpFile = args[1];

        Reader r = new FileReader(csvFile);
        BufferedReader br = new BufferedReader(r);

        List<User> users = br.lines()
            .skip(1)
            .map(l -> l.split(","))
            .map(cols -> {
                User user = new User();
                user.setFirstName(cols[0]);
                user.setLastName(cols[1]);
                user.setAddress(cols[2]);
                user.setYears(Integer.parseInt(cols[3]));
                return user;
            })
            .toList();

        br.close();
        r.close();

        Map<String, List<User>> groupByFirstName = users.stream()
            .collect(
                Collectors.groupingBy(user -> user.getFirstName())
            );

        for (String c : groupByFirstName.keySet()) {
            List<User> listOfUsers = groupByFirstName.get(c);
            System.out.printf("firstNames: %s - %d\n", c, listOfUsers.size());
        }
    }
}
