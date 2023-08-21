package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AdministrativeArea{
    @JsonProperty("AdministrativeAreaName")
    private String administrativeAreaName;
    @JsonProperty("Locality")
    private Locality locality;
    @JsonProperty("SubAdministrativeArea")
    private SubAdministrativeArea subAdministrativeArea;
}
