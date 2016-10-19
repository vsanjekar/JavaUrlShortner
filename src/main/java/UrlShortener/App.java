package UrlShortener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UrlDataStore dataStore = UrlDataStore.getInstance();

        UrlServer server1 = new UrlServer(dataStore);

        UrlClient client1 = new UrlClient(server1);

        String shortUrl = client1.shortenUrl("https://www.google.com/maps/dir/San+Francisco+International+Airport+(SFO),+San+Francisco,+CA+94128/Vancouver,+BC,+Canada/New+York,+NY/Los+Angeles,+CA/@48.1459196,-106.3334294,3.98z/data=!4m28!4m27!1m5!1m1!1s0x808f778c55555555:0xa4f25c571acded3f!2m2!1d-122.3789554!2d37.6213129!1m5!1m1!1s0x548673f143a94fb3:0xbb9196ea9b81f38b!2m2!1d-123.1207375!2d49.2827291!1m5!1m1!1s0x89c24fa5d33f083b:0xc80b8f06e177fe62!2m2!1d-74.0059413!2d40.7127837!1m5!1m1!1s0x80c2c75ddc27da13:0xe22fdf6f254608f4!2m2!1d-118.2436849!2d34.0522342!2m1!1b1!3e0");
        System.out.println(shortUrl);
        String longUrl = server1.getLongUrl(shortUrl);
        System.out.println(longUrl);


        shortUrl = client1.shortenUrl("https://www.google.com/maps/dir/San+Francisco+International+Airport+(SFO),+San+Francisco,+CA+94128/Vancouver,+BC,+Canada/New+York,+NY/Los+Angeles,+CA/@48.1459196,-106.3334294,3.98z/data=!4m28!4m27!1m5!1m1!1s0x808f778c55555555:0xa4f25c571acded3f!2m2!1d-122.3789554!2d37.6213129!1m5!1m1!1s0x548673f143a94fb3:0xbb9196ea9b81f38b!2m2!1d-123.1207375!2d49.2827291!1m5!1m1!1s0x89c24fa5d33f083b:0xc80b8f06e177fe62!2m2!1d-74.0059413!2d40.7127837!1m5!1m1!1s0x80c2c75ddc27da13:0xe22fdf6f254608f4!2m2!1d-118.2436849!2d34.0522342!2m1!1b1!3e0");
        System.out.println(shortUrl);
        longUrl = server1.getLongUrl(shortUrl);
        System.out.println(longUrl);

    }
}
