package nl.mblokhuijzen.untisparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by MBlokhuijzen on 04/09/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://roosters.mboutrecht.nl/SPO/37/c/c00015.htm").get();
        Elements weekdays = document.select("body.tt > center > table").get(0).select("tr").get(0).select("td");

        for(Element element : weekdays) {
            System.out.println(element.select("td").first().text());
        }
    }
}
