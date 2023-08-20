package by.test.yandex_weather.connector;

public enum ParamsForRequest {
    PUT("put"),
    LON("lon"),
    EXTRA("extra"),
    API_KEY("X-Yandex-API-Key");

    private String param;

    ParamsForRequest(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}
