import org.example.RegexMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class regexTest {

    RegexMain reg = new RegexMain();

    @Test
    public void testValidPhoneNumber() {

        String s1 = "(+380)50-333-33-33";
        String s2 = "123-456-7890";
        String s3 = "(+380)50-sdf-33-33";

        assertTrue(reg.phoneNumber(s1));
        assertFalse(reg.phoneNumber(s2));
        assertFalse(reg.phoneNumber(s3));
    }

    @Test
    public void testRemoveSpace() {
        String correctString = "Я хочу бути програмістом";

        String s = "Я     хочу     бути      програмістом";

        assertEquals(correctString, reg.removeSpace(s));
    }

    @Test
    public void testRemoveHtml() {
        String correctString = " Символы круглых скобок '(' и ')'. \n" +
                "Эти символы позволяют получить из искомой строки дополнительную информацию. \n" +
                "Обычно, если парсер регулярных выражений ищет в тексте информацию по заданному выражению и находит ее - он просто возвращает найденную строку.\n" +
                " А вот тут ссылка, чтоб жизнь медом не казалась. ";

        String s = "<div> <p>Символы круглых скобок <code>'('</code> и <code>')'</code>. \n" +
                "Эти символы позволяют получить из искомой строки дополнительную информацию. \n" +
                "<br/>Обычно, если парсер регулярных выражений ищет в тексте информацию по заданному выражению и находит ее - он просто возвращает найденную строку.\n" +
                "</p> <p align=\"right\">А вот тут <a href=\"google.com\">ссылка</a>, чтоб жизнь медом не казалась.</p> </div>";

        assertEquals(correctString, reg.removeHtml(s));
    }






}
