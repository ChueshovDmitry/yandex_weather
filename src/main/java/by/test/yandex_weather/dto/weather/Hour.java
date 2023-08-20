package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Hour{
    private String hour;
    private Integer hour_ts;
    private Integer temp;
    private Integer feels_like;
    private String icon;
    private String condition;
    private Double cloudness;
    private Integer prec_type;
    private Double prec_strength;
    private Boolean is_thunder;
    private String wind_dir;
    private Double wind_speed;
    private Double wind_gust;
    private Integer pressure_mm;
    private Integer pressure_pa;
    private Integer humidity;
    private Integer uv_index;
    private Integer soil_temp;
    private Double soil_moisture;
    private Double prec_mm;
    private Integer prec_period;
    private Integer prec_prob;
}
