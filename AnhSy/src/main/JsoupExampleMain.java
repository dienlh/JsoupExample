package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupExampleMain {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36";

    public static void main(String[] args) {
        String url = "https://google.com.vn";
        try {
            Document doc = Jsoup.connect(url).userAgent(USER_AGENT).timeout(5000).get();
            System.out.println(doc.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

