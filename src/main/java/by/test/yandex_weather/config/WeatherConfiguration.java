package by.test.yandex_weather.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * @Author Dmitry Chueshov
 **/
@Configuration
public class WeatherConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder()
                .build();
    }
}
