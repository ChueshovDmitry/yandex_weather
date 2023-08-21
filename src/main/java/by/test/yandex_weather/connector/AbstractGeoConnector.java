package by.test.yandex_weather.connector;

import by.test.yandex_weather.dto.geo.Root;
import org.springframework.http.HttpEntity;

public interface AbstractGeoConnector {
    HttpEntity<Root> getForEntity(String place);
}
