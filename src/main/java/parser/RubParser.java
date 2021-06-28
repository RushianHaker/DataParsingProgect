package parser;

import com.entity.Rub;
import com.services.RubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RubParser {

    @Autowired
    RubService rubService;

    @Scheduled(fixedDelay = 10000)
    public void parseRub(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=02/03/2001&date_req2=14/03/2001&VAL_NM_RQ=R01235";
        ResponseEntity<Rub> response = restTemplate.getForEntity(url + "/1", Rub.class);
        response.getStatusCode();
    }
}
