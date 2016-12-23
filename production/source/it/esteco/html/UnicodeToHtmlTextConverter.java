package it.esteco.html;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class UnicodeToHtmlTextConverter {

    private String fullFilenameWithPath;
    private Reader textReader;

    public UnicodeToHtmlTextConverter(String fullFilenameWithPath) {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public UnicodeToHtmlTextConverter(Reader textReader) {
        this.textReader = textReader;
    }

    public String convertToHtml() throws IOException {
        BufferedReader reader;
        if (textReader == null) {
            reader = new BufferedReader(new FileReader(fullFilenameWithPath));
        } else {
            reader = new BufferedReader(textReader);
        }

        String line = reader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }

    public String getFilename() {
        return this.fullFilenameWithPath;
    }
}
