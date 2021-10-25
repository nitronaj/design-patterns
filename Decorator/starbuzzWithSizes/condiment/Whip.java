package starbuzzWithSizes.condiment;

import starbuzzWithSizes.beverage.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		switch (getSize()) {
			case GRANDE:
				return beverage.cost() + 0.10;
			case VENTI:
				return beverage.cost() + 0.08;
			case TALL:
			default:
				return beverage.cost() + 0.05;
		}
	}
}
