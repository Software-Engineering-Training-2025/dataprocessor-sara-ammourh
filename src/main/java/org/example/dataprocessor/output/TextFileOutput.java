package org.example.dataprocessor.output;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileOutput implements IOutputType {
    @Override
    public void output(double result) throws IOException {
        String resultString = "Result = " + result;
        Path path = Paths.get("target/result.txt");
        Files.createDirectories(path.getParent());
        Files.write(path, resultString.getBytes());
    }
}
