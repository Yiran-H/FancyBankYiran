package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private static BufferedWriter writer;
    public static void addLine(String s, String path) throws IOException {
        writer = new BufferedWriter(new FileWriter(path, true));
        writer.append("\n").append(s);
        writer.close();
    }
}
