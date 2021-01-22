
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .map(parts -> new Country(parts[3], Integer.valueOf(parts[4]), parts[2].split(" ")[1].trim(), Double.valueOf(parts[5])))
                    .sorted((x, y) -> x.compareTo(y))
                    .forEach(country -> System.out.println(country));
                    
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
