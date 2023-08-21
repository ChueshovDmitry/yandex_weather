package by.test.yandex_weather.model;

public enum ParamsForWeatherRequest {
    LAT("lat"),
    LON("lon"),
    EXTRA("extra"),
    API_KEY("X-Yandex-API-Key");

    private String param;

    ParamsForWeatherRequest(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
