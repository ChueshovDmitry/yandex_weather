package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Info{
    private Boolean n;
    private Integer geoid;
    private String url;
    private Double lat;
    private Double lon;
    private Tzinfo tzinfo;
    private Integer def_pressure_mm;
    private Integer def_pressure_pa;
    private String slug;
    private Integer zoom;
    private Boolean nr;
    private Boolean ns;
    private Boolean nsr;
    private Boolean p;
    private Boolean f;
    private Boolean _h;
}
