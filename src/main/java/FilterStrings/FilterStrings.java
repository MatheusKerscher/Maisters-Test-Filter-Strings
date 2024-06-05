package FilterStrings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static List<String> getStringsFromFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        List<String> strings = Arrays.asList(content.split(";"));

        return strings.stream()
            .map(String::trim)
            .filter(s -> s.startsWith("a") && s.length() == 3)
            .collect(Collectors.toList());
    }
}
