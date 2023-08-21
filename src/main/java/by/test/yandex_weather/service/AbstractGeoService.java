package by.test.yandex_weather.service;

import by.test.yandex_weather.dto.forecast.WeatherModel;
import by.test.yandex_weather.dto.geo.Root;
import by.test.yandex_weather.dto.weather.RootDto;

public interface AbstractGeoService {
    Root getForecast(String place);

}
