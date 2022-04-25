import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    File file;
    static String regex = "(.*)[—с]трада(.*)";

    public Parser(File file) {
        this.file = file;
    }

    ArrayList<String> parser() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(String.valueOf(file)));
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] strings = scanner.nextLine().split("[ .,?]");
            for (String str : strings) {
                if (str.matches(regex)) {
                    list.add(str);
                }
            }
        }
        return list;
    }



}
