public class StatisticsDisplay implements Observer, DisplayElement {
	float temperature;
	float humidity;
	float pressure;
	WeatherData weatherData = new WeatherData();

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + temperature + "/" + temperature + "/" + temperature);
	}

}
