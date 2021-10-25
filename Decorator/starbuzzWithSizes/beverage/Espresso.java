package starbuzzWithSizes.beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		switch (getSize()) {
			case GRANDE:
				return 1.99;
			case VENTI:
				return 1.79;
			case TALL:
			default:
				return 1.59;
		}
	}
}
