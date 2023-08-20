package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tzinfo{
    private String name;
    private String abbr;
    private Boolean dst;
    private Integer offset;
}
