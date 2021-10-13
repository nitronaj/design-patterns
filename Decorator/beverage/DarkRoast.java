package beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	public double cost() {
		switch (getSize()) {
			case GRANDE:
				return .99;
			case VENTI:
				return .88;
			case TALL:
			default:
				return .75;
		}
	}
}
