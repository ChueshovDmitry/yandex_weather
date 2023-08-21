package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Thoroughfare{
    @JsonProperty("ThoroughfareName")
    private String thoroughfareName;
    @JsonProperty("Premise")
    private Premise premise;
}
