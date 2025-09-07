package org.example.dataprocessor.output;
import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static IOutputType createOutputType(OutputType outputType) {
        if (outputType == OutputType.CONSOLE) {
            return new ConsoleOutput();
        }
        if (outputType == OutputType.TEXT_FILE) {
            return new TextFileOutput();
        }
        throw new RuntimeException("Invalid OutputType");
    }
}
