package lang.print.gaps.task4;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class IntRepresentationTest extends BaseIOTest {

    @Test
    void mainPrintToConsoleExpected() throws IOException {
        Path path = Paths.get("src/main/java/lang/print/gaps/task4/IntRepresentation.java");
        List<String> strings = Files.readAllLines(path);
        List<String> charC = strings.stream().filter(line -> line.contains("99")).toList();
        List<String> charH = strings.stream().filter(line -> line.contains("104")).toList();
        List<String> charA = strings.stream().filter(line -> line.contains("97")).toList();
        List<String> charR = strings.stream().filter(line -> line.contains("114")).toList();

        assertEquals(0, charC.size());
        assertEquals(0, charH.size());
        assertEquals(0, charA.size());
        assertEquals(0, charR.size());
    }
}