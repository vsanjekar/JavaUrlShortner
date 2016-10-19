package UrlShortener;

/**
 * Created by vinay on 10/18/16.
 */
public class UrlClient implements UrlShortenerClient {

    UrlShortenerServer urlServer;

    public UrlClient(UrlShortenerServer server) {
        urlServer = server;
    }

    public String shortenUrl(String url) {
        long id = urlServer.getNextId(url);
        // convert long to string
        String shortUrlId = UrlConverter.getIdRep(id);
        String shortUrl = "short.url/"+shortUrlId;
        return shortUrl;
    }
}
