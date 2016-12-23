package it.esteco.html;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public class ConvertUnicodeTextToHtml {

    @Test
    public void convertEmptyUnicodeFile() throws Exception {
        String path = getClass().getClassLoader().getResource("empty.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(new FileReader(path));

        String html = textConverter.convertToHtml();

        assertEquals("", html);
    }

    @Test
    public void convertUnicodeFileText() throws Exception {
        String path = getClass().getClassLoader().getResource("unicodeText.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(new FileReader(path));

        String html = textConverter.convertToHtml();

        assertEquals("a<br />b &amp; c<br />", html);
    }

    @Test
    public void convertUnicodeEmptyText() throws Exception {
        UnicodeToHtmlTextConverter unicodeToHtmlTextConverter = new UnicodeToHtmlTextConverter(new StringReader(""));

        String html = unicodeToHtmlTextConverter.convertToHtml();

        assertEquals("", html);
    }
}
