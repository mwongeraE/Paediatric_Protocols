package bpp.kelvian.com;

/**
 * Created by kelvian on 4/27/17.
 */

public class RssItem {

    private final String title;
    private final String link;

    public RssItem(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
}