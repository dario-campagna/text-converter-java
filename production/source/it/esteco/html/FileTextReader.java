package it.esteco.html;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader implements TextReader {

    private BufferedReader reader;

    public FileTextReader(String path) throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(path));
    }

    @Override
    public String readLine() throws IOException {
        return reader.readLine();
    }
}
