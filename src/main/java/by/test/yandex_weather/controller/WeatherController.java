package by.test.yandex_weather.controller;

import by.test.yandex_weather.dto.forecast.WeatherModel;
import by.test.yandex_weather.dto.weather.RootDto;
import by.test.yandex_weather.model.RequestModel;
import by.test.yandex_weather.service.impl.WeatherService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Dmitry Chueshov
 **/
@RestController
@RequestMapping("api/weather/")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping("forecast")
    public RootDto getForecast(@RequestBody @Validated RequestModel model){
        return weatherService.getForecast(model.getLat().toString(),model.getLon().toString());
    }

    @PostMapping("forecast/today")
    public WeatherModel getTodayForecast(@RequestBody @Validated RequestModel model){
        return weatherService.getTodayForecast(model.getLat().toString(),model.getLon().toString());
    }

}
