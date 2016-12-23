package it.esteco.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class UnicodeToHtmlTextConverter {

    private Reader textReader;

    public UnicodeToHtmlTextConverter(Reader textReader) {
        this.textReader = textReader;
    }

    public String convertToHtml() throws IOException {
        BufferedReader reader = new BufferedReader(textReader);

        String line = reader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }
}
