package org.example.dataprocessor.output;
import java.io.IOException;

public interface IOutputType {
    void output(double result) throws IOException;
}
