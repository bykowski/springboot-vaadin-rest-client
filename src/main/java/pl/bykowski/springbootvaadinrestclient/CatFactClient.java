package pl.bykowski.springbootvaadinrestclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
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
