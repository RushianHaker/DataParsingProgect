package parser;

import com.entity.Rub;
import com.services.RubService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RubParser {

    @Autowired
    RubService rubService;

    @Scheduled(fixedDelay = 10000)
    public void parseRub() throws IOException {
        String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=02/03/2001&date_req2=14/03/2001&VAL_NM_RQ=R01235";
        try {
            Document doc = Jsoup.connect(url)
                    .timeout(5000)
                    .get();

            Elements valuesRub = doc.getElementsByClass("col-md-2 col-xs-9 _right mono-num");
            for (Element el: valuesRub) {
                String title = el.ownText();
                if(!rubService.isExist(title)){
                    Rub rub = new Rub();
                    rub.setCount(title);
                    rubService.save(rub);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
