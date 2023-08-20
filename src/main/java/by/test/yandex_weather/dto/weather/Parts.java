package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Parts{
    private Day day;
    private Morning morning;
    private NightShort night_short;
    private DayShort day_short;
    private Evening evening;
    private Night night;
}
