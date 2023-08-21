package by.test.yandex_weather.service;

import by.test.yandex_weather.connector.WheaterConnector;
import by.test.yandex_weather.dto.forecast.WeatherModel;
import by.test.yandex_weather.dto.weather.Forecast;
import by.test.yandex_weather.dto.weather.RootDto;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Dmitry Chueshov
 **/
@Service
public class WeatherService implements AbstractWeatherService {
    private final WheaterConnector wheaterConnector;

    public WeatherService(WheaterConnector wheaterConnector) {
        this.wheaterConnector = wheaterConnector;
    }

    @Override
    public RootDto getForecast(String lat, String lon) {
        HttpEntity<RootDto> forEntity = wheaterConnector.getForEntity(lat,lon);
        RootDto body = forEntity.getBody();
        return body;
    }

    @Override
    public WeatherModel getTodayForecast(String lat, String lon) {
        RootDto forecast = getForecast(lat, lon);
        List<Forecast> filterList = forecast.getForecasts().stream().filter(forecastModel -> forecastModel.getDate().equals(LocalDate.now().toString())).collect(Collectors.toList());
        WeatherModel model = WeatherModel.builder()
                .date(forecast.getNow_dt().toString())
                .temp(forecast.getFact().getTemp())
                .moon_code(filterList.stream().findFirst().get().getMoon_code())
                .sunrise(filterList.stream().findFirst().get().getSunrise())
                .set_end(filterList.stream().findFirst().get().getSet_end()).build();
        return model;
    }
}
