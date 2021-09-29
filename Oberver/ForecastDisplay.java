public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;


	WeatherData weatherData = new WeatherData();

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update() {
		lastPressure = currentPressure ;
		currentPressure = weatherData.getPressure();
		display();
	}

	public void display() {

		if(lastPressure == currentPressure) {
			System.out.println("Forecast: More of the same");
		}

		if(lastPressure < currentPressure) {
			System.out.println("Forecast: Improving weather on the way!");
		}


		if(lastPressure > currentPressure) {
			System.out.println("Forecast: Watch out for cooler, rainy weather!");
		}
	}

}
