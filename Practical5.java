import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Practical5 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                word = word.toLowerCase();

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        br.close();

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
