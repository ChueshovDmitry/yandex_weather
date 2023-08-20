package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RootDto {
    private Integer now;
    private Date now_dt;
    private Info info;
    private GeoObject geo_object;
    private Yesterday yesterday;
    private Fact fact;
    private List<Forecast> forecasts;
}
