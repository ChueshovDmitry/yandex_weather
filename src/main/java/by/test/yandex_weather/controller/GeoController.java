package by.test.yandex_weather.controller;

import by.test.yandex_weather.dto.geo.Root;
import by.test.yandex_weather.service.AbstractGeoService;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Dmitry Chueshov
 **/
@RestController
@RequestMapping("api/geo/")
public class GeoController {
    private final AbstractGeoService geoService;

    public GeoController(AbstractGeoService geoService) {
        this.geoService = geoService;
    }

    @GetMapping("place")
    public Root getPlace(@RequestParam String place){
        return geoService.getForecast(place);
    }


}
