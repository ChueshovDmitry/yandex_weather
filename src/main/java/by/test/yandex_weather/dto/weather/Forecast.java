package by.test.yandex_weather.dto.weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Forecast{
    private String date;
    private Integer date_ts;
    private Integer week;
    private String sunrise;
    private String sunset;
    private String rise_begin;
    private String set_end;
    private Integer moon_code;
    private String moon_text;
    private Parts parts;
    private ArrayList<Hour> hours;
    private Biomet biomet;

}
