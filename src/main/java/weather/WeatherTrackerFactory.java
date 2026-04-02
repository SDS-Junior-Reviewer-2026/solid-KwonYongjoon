package weather;

public class WeatherTrackerFactory {
    public WeatherNotifier getNotifier(String weatherConditions) {
        if ("rainy".equals(weatherConditions)) {
            return new Phone();
        } else if ("sunny".equals(weatherConditions)) {
            return new Email();
        }
        return null;
    }
}