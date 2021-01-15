package com.example.demo.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URLEncoder;

public class BaiduSpider {

    private String searchWord;

    private Integer pageNo;

    private String url = "https://www.baidu.com/s?ie=utf-8,utf-8&mod=1&isbd=1&isid=c9afb0f400032d09&tn=monline_3_dg&usm=1&rsv_pq=c9afb0f400032d09&rsv_t=b66av5hHpeO21LxOOG20wlLOmMvsct4VeRmIaPeSn0O+RTbzcUDdZOZC57dFq6rlXGMS&rsv_page=1&rsv_sid=undefined&_ss=1&clist=4584baa0300d9a1d%204584baa0300d9a1d&hsug=&f4s=1&csor=6&_cr1=32335";

    public BaiduSpider() {
        this("饸烙面",10);
    }

    public BaiduSpider(String searchWord, Integer pageNo) {
        this.searchWord = searchWord;
        this.pageNo = 10;
        try {
            startRun();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startRun() throws IOException {

        StringBuilder sb = new StringBuilder(this.url);
        String word = URLEncoder.encode(this.searchWord);
        sb.append("&oq=").append(word);
        sb.append("&wd=").append(word);
        sb.append("&bs=").append(word);
        sb.append("&pn=").append(this.pageNo);

        Document document = Jsoup.connect(sb.toString()).get();
        String pageSelector = "div[class=result c-container]";
        Elements linke = document.select(pageSelector);
        for (int i = 0; i < linke.size(); i++) {
            Element element = linke.get(i);
            System.out.println("link" + element.attr("href"));
            System.out.println("text" +element.attr("text"));
        }
    }


}
