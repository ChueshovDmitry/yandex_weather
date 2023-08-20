package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Fact{
    private Integer obs_time;
    private Integer uptime;
    private Integer temp;
    private Integer feels_like;
    private String icon;
    private String condition;
    private Integer cloudness;
    private Integer prec_type;
    private Integer prec_prob;
    private Double prec_strength;
    private Boolean is_thunder;
    private Integer wind_speed;
    private String wind_dir;
    private Integer pressure_mm;
    private Integer pressure_pa;
    private Integer humidity;
    private String daytime;
    private Boolean polar;
    private String season;
    private String source;
    private Double soil_moisture;
    private Integer soil_temp;
    private Integer uv_index;
    private Double wind_gust;
}
