package it.esteco.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class StringTextReader implements TextReader {

    private BufferedReader bufferedReader;

    public StringTextReader(String text) {
        this.bufferedReader = new BufferedReader(new StringReader(text));
    }

    @Override
    public String readLine() throws IOException {
        return bufferedReader.readLine();
    }
}
