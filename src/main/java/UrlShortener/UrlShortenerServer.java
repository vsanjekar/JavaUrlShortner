package UrlShortener;

/**
 * Created by vinay on 10/18/16.
 */
public interface UrlShortenerServer {

    long getNextId(String longUrl);
    String getLongUrl(String shortUrl);

}
