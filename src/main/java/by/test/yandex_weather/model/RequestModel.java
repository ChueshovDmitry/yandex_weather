package by.test.yandex_weather.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @Author Dmitry Chueshov
 **/

@Getter
@Setter
@NoArgsConstructor
public class RequestModel {
    @Min(-90)
    @Max(90)
    private Long lat;

    @Min(-180)
    @Max(180)
    private Long lon;
}
