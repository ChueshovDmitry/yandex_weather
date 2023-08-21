package by.test.yandex_weather.service.impl;

import by.test.yandex_weather.connector.impl.GeoConnector;
import by.test.yandex_weather.dto.geo.Root;
import by.test.yandex_weather.service.AbstractGeoService;
import org.springframework.stereotype.Service;

/**
 * @Author Dmitry Chueshov
 **/
@Service
public class GeoServiceImpl implements AbstractGeoService {

    private final GeoConnector geoConnector;

    public GeoServiceImpl(GeoConnector geoConnector) {
        this.geoConnector = geoConnector;
    }

    @Override
    public Root getForecast(String place) {
        return geoConnector.getForEntity(place).getBody();
    }
}
