package unit_tests;

import org.junit.Assert;
import org.junit.Test;
import parser_example.Constants;
import parser_example.URLParser;

import static org.junit.Assert.*;

public class URLParserTest {

    @Test
    public void test_http_protocol() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk");
        assertTrue(mUrlParser.getProtocol().equals(Constants.PROTOCOL_HTTP));
    }

    @Test
    public void test_ftp_protocol() {
        URLParser mUrlParser = new URLParser("ftp://ftp.essex.ac.uk");
        assertTrue(mUrlParser.getProtocol().equals(Constants.PROTOCOL_FTP));
    }

    @Test
    public void test_generic_protocol() {
        URLParser mUrlParser = new URLParser("xyz://www.abc.uk");
        assertTrue(mUrlParser.getProtocol().equals(Constants.PROTOCOL_GENERIC));
    }

    @Test
    public void test_simple_site() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk");
        assertTrue(mUrlParser.getSite().equals("www.essex.ac.uk"));
    }

    @Test
    public void test_simple_site_with_path() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk/index.html");
        assertTrue(mUrlParser.getSite().equals("www.essex.ac.uk"));
    }

    @Test
    public void test_simple_site_with_slash() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk/");
        assertTrue(mUrlParser.getSite().equals("www.essex.ac.uk"));
    }

    @Test
    public void test_simple_path() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk/index.html");
        assertTrue(mUrlParser.getPath().equals("index.html"));
    }

    @Test
    public void test_complex_path() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk/index/uni/hello/olo.html");
        Assert.assertArrayEquals("index/uni/hello/olo.html".getBytes(), mUrlParser.getPath().getBytes());
    }

    @Test
    public void test_empty_path() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk");
        assertTrue(mUrlParser.getPath().equals(""));
    }

    @Test
    public void test_empty_path_with_slash() {
        URLParser mUrlParser = new URLParser("http://www.essex.ac.uk/");
        assertTrue(mUrlParser.getPath().equals(""));
    }

}
