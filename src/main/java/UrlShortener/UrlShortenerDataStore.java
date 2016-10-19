package UrlShortener;

/**
 * Created by vinay on 10/18/16.
 */
public interface UrlShortenerDataStore {
    long put(String longUrl);
    String get(long id);
}
