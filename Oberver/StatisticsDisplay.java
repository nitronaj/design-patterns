public class StatisticsDisplay implements Observer, DisplayElement {
	float temperature ;
	float min = 0;
	float max = 0;
	float sum = 0;
	float avg = 0;
	int count = 0;

	WeatherData weatherData = new WeatherData();

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update() {
		this.temperature = weatherData.getTemperature();

		if(temperature >= max) {
			max = temperature;
		} else if( temperature > min ){
			min = temperature;
		}

		count += 1;
		sum += temperature;
		avg = sum / count;

		display();
	}

	public void display() {
		System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n",avg,max,min);
	}

}
