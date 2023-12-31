package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Address{
    private String country_code;
    private String formatted;
    private String postal_code;
    @JsonProperty("Components")
    private ArrayList<Component> components;
}
