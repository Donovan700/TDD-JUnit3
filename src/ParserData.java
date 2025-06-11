package src;


import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserData extends DefaultHandler {

    public void parse(String filePath) throws SAXException, IOException, ParserConfigurationException {
        File file = new File(filePath);
        if (file.exists()) {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(file, this);
        } else {
            System.out.println("File not found on path : " + filePath);
        }
    }
}
