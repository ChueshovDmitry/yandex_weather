package by.test.yandex_weather.dto.geo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoObject{
    private MetaDataProperty metaDataProperty;
    private String name;
    private String description;
    private BoundedBy boundedBy;
    @JsonProperty("Point")
    private Point point;
}
