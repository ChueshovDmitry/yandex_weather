package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GeocoderMetaData{
    private String precision;
    private String text;
    private String kind;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("AddressDetails")
    private AddressDetails addressDetails;
}
