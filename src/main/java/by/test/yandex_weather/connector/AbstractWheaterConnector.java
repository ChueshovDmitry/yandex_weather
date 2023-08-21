package by.test.yandex_weather.connector;

import by.test.yandex_weather.dto.weather.RootDto;
import org.springframework.http.HttpEntity;

public interface AbstractWheaterConnector {
    HttpEntity<RootDto> getForEntity(String lat, String lon);
}
