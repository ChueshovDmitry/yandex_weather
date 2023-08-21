package by.test.yandex_weather.service;

import by.test.yandex_weather.dto.forecast.WeatherModel;
import by.test.yandex_weather.dto.weather.RootDto;

public interface AbstractWeatherService {
    RootDto getForecast(String lat, String lon);

    WeatherModel getTodayForecast(String lat, String lon);
}
