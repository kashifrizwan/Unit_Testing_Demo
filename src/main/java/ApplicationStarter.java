import parser_example.URLParser;

public class ApplicationStarter {

    public static void main(String[] args) {
        URLParser mUrlParser = new URLParser("http://www.google.com");

        System.out.println(mUrlParser.getProtocol());
        System.out.println(mUrlParser.getSite());
        System.out.println(mUrlParser.getPath());
    }

}
