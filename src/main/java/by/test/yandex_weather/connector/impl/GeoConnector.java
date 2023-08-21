package by.test.yandex_weather.connector.impl;

import by.test.yandex_weather.connector.AbstractGeoConnector;
import by.test.yandex_weather.dto.geo.Root;
import by.test.yandex_weather.dto.weather.RootDto;
import by.test.yandex_weather.model.ParamsForGeoRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Dmitry Chueshov
 **/
@Component
public class GeoConnector implements AbstractGeoConnector {
    @Value("${yandex.geo}")
    private String url;
    @Value("${yandex.geo_apikey}")
    private String apikey;
    private final RestTemplate restTemplate;

    public GeoConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public HttpEntity<Root> getForEntity(String place) {
        Map<String, String> params = new HashMap<>();
        params.put(ParamsForGeoRequest.APIKEY.getParam(), apikey);
        params.put(ParamsForGeoRequest.GEOCODE.getParam(), place);
        params.put(ParamsForGeoRequest.FORMAT.getParam(), "json");

        ResponseEntity<Root> exchange = restTemplate.getForEntity(url, Root.class, params);

        return exchange;
    }
}