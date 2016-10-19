package UrlShortener;

/**
 * Created by vinay on 10/18/16.
 */
public class UrlServer implements UrlShortenerServer {

    // Distributed counter
    UrlShortenerDataStore urlDataStore;

    public UrlServer(UrlShortenerDataStore dataStore) {
        urlDataStore = dataStore;
    }

    public long getNextId(String longUrl) {
        long id = urlDataStore.put(longUrl);
        return id;
    }

    public String getLongUrl(String shortUrl) {
        // Convert short Url to id
        String shortUrlId = shortUrl.substring(10);
        long id = UrlConverter.getId(shortUrlId);
        return urlDataStore.get(id);
    }

}
