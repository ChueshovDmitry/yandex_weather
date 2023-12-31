package by.test.yandex_weather.model;

public enum ParamsForGeoRequest {
    APIKEY("apikey"),
    GEOCODE("geocode"),
    FORMAT("format");

    private String param;

    ParamsForGeoRequest(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
