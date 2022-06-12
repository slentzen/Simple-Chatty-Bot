import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        words.stream().forEach(System.out::println);
    }
}