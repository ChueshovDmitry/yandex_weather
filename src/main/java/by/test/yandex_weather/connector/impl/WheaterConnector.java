package by.test.yandex_weather.connector.impl;

import by.test.yandex_weather.connector.AbstractWheaterConnector;
import by.test.yandex_weather.dto.weather.RootDto;
import by.test.yandex_weather.model.ParamsForWeatherRequest;
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
public class WheaterConnector implements AbstractWheaterConnector {
    @Value("${yandex.weather}")
    private String url;
    @Value("${yandex.weather_apikey}")
    private String apikey;
    private final RestTemplate restTemplate;

    public WheaterConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public HttpEntity<RootDto> getForEntity(String lat, String lon) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(ParamsForWeatherRequest.API_KEY.getParam(), apikey);

        Map<String, String> params = new HashMap<>();
        params.put(ParamsForWeatherRequest.LAT.getParam(), lat);
        params.put(ParamsForWeatherRequest.LON.getParam(), lon);
        params.put(ParamsForWeatherRequest.EXTRA.getParam(), "true");

        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<RootDto> exchange = restTemplate.exchange(url, HttpMethod.GET, httpEntity, RootDto.class, params);

        return exchange;
    }
}