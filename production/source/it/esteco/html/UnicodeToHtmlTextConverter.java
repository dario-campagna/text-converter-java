package it.esteco.html;

import java.io.IOException;

public class UnicodeToHtmlTextConverter {

    private TextReader textReader;

    public UnicodeToHtmlTextConverter(TextReader textReader) {
        this.textReader = textReader;
    }

    public String convertToHtml() throws IOException {
        String line = textReader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = textReader.readLine();
        }
        return html;
    }
}
