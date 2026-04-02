package weather;

public class WeatherTracker {
    String currentConditions;
    WeatherTrackerFactory weatherTrackerFactory;

    public WeatherTracker() {
        weatherTrackerFactory = new WeatherTrackerFactory();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        WeatherNotifier notifier = weatherTrackerFactory.getNotifier(weatherDescription);
        String alert = notifier.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}