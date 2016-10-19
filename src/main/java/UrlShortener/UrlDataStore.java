package UrlShortener;

import java.util.HashMap;

/**
 * Created by vinay on 10/18/16.
 */

// Singleton ?
public class UrlDataStore implements UrlShortenerDataStore {
    private long id;
    private HashMap<Long, String> idUrlMap = new HashMap<Long, String>();
    private static UrlDataStore INSTANCE;

    private UrlDataStore() {
        id = 1000000;
    }

    public static UrlDataStore getInstance() {
        if (INSTANCE == null)
            INSTANCE = new UrlDataStore();

        return INSTANCE;
    }

    public long put(String longUrl) {
        idUrlMap.put(id, longUrl);
        return id++;
    }

    public String get(long id) {
        return idUrlMap.get(id);
    }
}
