import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {


        //ищем все однокоренные к слову "Страдание"

        Parser parser = new Parser(new File("voyna.txt"));

        ArrayList<String> list = parser.parser();
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            int countWords = 0;
            for (String str2 : list) {
                if (str.equals(str2)) countWords++;
            }
            map.put(str, countWords);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - совпадений: " + entry.getValue());
        }

        //выводим табличку умножения

        int[][] table = new int[10][10];

        for (int i = 1; i <= table.length; i++) {
            table[i - 1][0] = i;
            for (int j = 1; j < table[i - 1].length; j++) {
                table[i - 1][j] = i * (j + 1);
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();

        }


    }


}
