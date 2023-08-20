package by.test.yandex_weather.controller;

import by.test.yandex_weather.dto.forecast.WeatherModel;
import by.test.yandex_weather.dto.weather.RootDto;
import by.test.yandex_weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("forecast")
    public RootDto getForecast(@RequestParam String put, @RequestParam String lon ){
        return weatherService.getForecast(put,lon);
    }

    @GetMapping("forecast/today")
    public WeatherModel getTodayForecast(@RequestParam String put, @RequestParam String lon ){
        return weatherService.getTodayForecast(put,lon);
    }

}
