package by.test.yandex_weather.dto.forecast;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Dmitry Chueshov
 **/
@Getter
@Setter
@Builder
public class WeatherModel {
    private Integer temp;
    private String date;
    private Integer moon_code;
    private String sunrise;
    private String set_end;
}
