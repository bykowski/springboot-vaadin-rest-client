package pl.bykowski.springbootvaadinrestclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatFactClient {
    RestTemplate restTemplate = new RestTemplate();

    public CatFact getCatFactFormApi() {
        ResponseEntity<CatFact> exchange = restTemplate.exchange(
                "https://cat-fact.herokuapp.com/facts/random",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                CatFact.class);
        return exchange.getBody();
    }







}
