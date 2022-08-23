import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FileReadEx {
    public void Run() throws IOException {
        FileReader file = new FileReader("text");
        Scanner scanner = new Scanner(file);
        readFileAndFindTheWord(scanner);
    }

    private void readFileAndFindTheWord(Scanner scanner) throws IOException {
        ArrayList<String> string = new ArrayList<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.startsWith("t") || (word.startsWith("T"))) {
                string.add(word);
               System.out.println(word);
            }
        }
        writeFile(String.valueOf(string));
    }

    private void writeFile(String word) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("text2"))) {
            writer.write(word);
        }
    }
}
