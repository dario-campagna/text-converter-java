package it.esteco.html;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertUnicodeFileToHtml {

    @Test
    public void emptyFile() throws Exception {
        String filePath = getClass().getClassLoader().getResource("empty.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(filePath);

        String html = textConverter.convertToHtml();

        assertEquals("", html);
    }

}
