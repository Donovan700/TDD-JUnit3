package src;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import junit.framework.TestCase;

public class ParserDataTest extends TestCase {
    private ParserData parserData;

    protected void setUp() {
        parserData = new ParserData();
    }

    public void testParseValidFile() {
        String filePath = "../client.xml";
        File testFile = new File(filePath);
        try {
            parserData.parse(filePath);
            assertTrue(testFile.exists());
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
            assertFalse(true);
        }
    }


    protected void tearDown() {
        parserData = null;
    }
}
