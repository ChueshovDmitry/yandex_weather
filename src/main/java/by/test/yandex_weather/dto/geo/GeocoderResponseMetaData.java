package by.test.yandex_weather.dto.geo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GeocoderResponseMetaData{
    private String request;
    private String results;
    private String found;
}
