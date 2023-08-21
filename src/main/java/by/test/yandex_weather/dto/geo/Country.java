package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Country{
    @JsonProperty("AddressLine")
    private String addressLine;
    @JsonProperty("CountryNameCode") 
    private String countryNameCode;
    @JsonProperty("CountryName") 
    private String countryName;
    @JsonProperty("AdministrativeArea") 
    private AdministrativeArea administrativeArea;
}
