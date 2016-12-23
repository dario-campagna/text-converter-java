package it.esteco.html;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertUnicodeFileToHtml {

    @Test
    public void convertEmptyUnicodeFile() throws Exception {
        String path = getClass().getClassLoader().getResource("empty.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(new FileTextReader(path));

        String html = textConverter.convertToHtml();

        assertEquals("", html);
    }

    @Test
    public void convertUnicodeFileText() throws Exception {
        String path = getClass().getClassLoader().getResource("unicodeText.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(new FileTextReader(path));

        String html = textConverter.convertToHtml();

        assertEquals("a<br />b &amp; c<br />", html);
    }

}
