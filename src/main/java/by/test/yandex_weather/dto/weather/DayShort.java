package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DayShort{
    private String _source;
    private Integer temp;
    private Integer temp_min;
    private Double wind_speed;
    private Double wind_gust;
    private String wind_dir;
    private Integer pressure_mm;
    private Integer pressure_pa;
    private Integer humidity;
    private Integer soil_temp;
    private Double soil_moisture;
    private Double prec_mm;
    private Integer prec_prob;
    private Integer prec_period;
    private Double cloudness;
    private Integer prec_type;
    private Double prec_strength;
    private String icon;
    private String condition;
    private Integer uv_index;
    private Integer feels_like;
    private String daytime;
    private Boolean polar;
    private Integer fresh_snow_mm;
}
