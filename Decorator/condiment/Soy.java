package condiment;

import beverage.Beverage;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		switch (getSize()) {
			case GRANDE:
				return beverage.cost() + 0.15;
			case VENTI:
				return beverage.cost() + 0.10;
			case TALL:
			default:
				return beverage.cost() + 0.05;
		}

	}
}
