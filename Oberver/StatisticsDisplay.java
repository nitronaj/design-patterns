public class StatisticsDisplay implements Observer, DisplayElement {
	float temperature;
	float humidity;
	float pressure;
	WeatherData weatherData = new WeatherData();

	public StatisticsDisplay(WeatherData weatherData) {
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
		System.out.println("Avg/Max/Min temperature = " + temperature + "/" + temperature + "/" + temperature);
	}

}
