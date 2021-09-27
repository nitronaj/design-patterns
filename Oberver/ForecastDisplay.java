public class ForecastDisplay implements Observer, DisplayElement {
	float temperature;
	float humidity;
	float pressure;
	WeatherData weatherData = new WeatherData();

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.pressure = weatherData.getPressure();
		display();
	}

	public void display() {
		System.out.println("Forecast: Improving weather on the way!");
	}

}
