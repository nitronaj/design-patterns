public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurement(80, 65, 30.4f);
		weatherData.setMeasurement(60, 65, 28.4f);
		weatherData.setMeasurement(80, 65, 30.4f);
		weatherData.setMeasurement(80, 65, 30.4f);
		weatherData.setMeasurement(100, 65, 31.4f);
		// currentDisplay.display();
	}
}
