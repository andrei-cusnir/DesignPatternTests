public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(22, 60, 30.3f);
        weatherData.setMeasurements(33, 63, 44.3f);
        weatherData.setMeasurements(44, 60, 30.3f);
    }
}
