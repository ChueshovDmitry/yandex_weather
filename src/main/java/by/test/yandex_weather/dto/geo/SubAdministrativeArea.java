package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubAdministrativeArea{
    @JsonProperty("SubAdministrativeAreaName")
    private String subAdministrativeAreaName;
    @JsonProperty("Locality")
    private Locality locality;
}
