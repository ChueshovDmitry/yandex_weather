package by.test.yandex_weather.connector;

import by.test.yandex_weather.dto.weather.RootDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Dmitry Chueshov
 **/
@Component
public class WheaterConnector {
    @Value("${yandex.weather}")
    private String url;
    @Value("${yandex.weather_apikey}")
    private String apikey;
    private final RestTemplate restTemplate;

    public WheaterConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public HttpEntity<RootDto> getForEntity(String put, String lon) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(ParamsForRequest.API_KEY.getParam(), apikey);

        Map<String, String> params = new HashMap<>();
        params.put(ParamsForRequest.PUT.getParam(), put);
        params.put(ParamsForRequest.LON.getParam(), lon);
        params.put(ParamsForRequest.EXTRA.getParam(), "true");

        return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(headers), RootDto.class, params);
    }
}