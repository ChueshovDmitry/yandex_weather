<h1><b>Api для работы с яндекс погодой.</b></h1>
Подлкючение к api yandex погода, данные на 5 дней вперед и на сегодня<br>
Получение погоды на сегодня (можно пересобрать в сервисе с новыми параметрами на ваш выбор)

Начало работы
- для работы необходимо внести изменения в <b>src/main/resources/application.properties</b> файле параметр <b>yandex.weather_apikey</b> который формируеться в кабинее разработчика яндекс
- ссылка для доступа к свагеру на порту http://localhost:8989/swagger-ui/index.html
- для получения данных необходимо передать параметры широты (lon) и долготы (put) места для которого формируется прогноз погоды


документация яндекса
https://yandex.ru/dev/weather/doc/dg/concepts/about.html


stack
- Spring boot