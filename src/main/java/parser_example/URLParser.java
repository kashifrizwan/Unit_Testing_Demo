package parser_example;

public class URLParser {

    private String site_base;
    private String protocol;
    private String site_path;

    public URLParser(String url) {

        String[] protocolSite = url.split("://");
        protocol = protocolSite[0];

        String[] site = protocolSite[1].split("/", 2);
        site_base = site[0];

        if(site.length > 1)
            site_path = site[1];
        else
            site_path = "";
    }

    public String getProtocol(){
        return protocol;
    }

    public String getSite(){
        return site_base;
    }

    public String getPath() {
        return site_path;
    }
}
