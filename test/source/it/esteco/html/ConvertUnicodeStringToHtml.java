package it.esteco.html;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertUnicodeStringToHtml {

    @Test
    public void convertUnicodeEmptyText() throws Exception {
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(new StringTextReader(""));

        String html = textConverter.convertToHtml();

        assertEquals("", html);
    }

    @Test
    public void convertUnicodeText() throws Exception {
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(new StringTextReader("a\nb & c"));

        String html = textConverter.convertToHtml();

        assertEquals("a<br />b &amp; c<br />", html);
    }

}
