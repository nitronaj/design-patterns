package condiment;

import beverage.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		switch (getSize()) {
			case VENTI:
				return beverage.cost() + 0.30;
			case GRANDE:
				return beverage.cost() + 0.20;
			case TALL:
			default:
				return beverage.cost() + 0.10;
		}
	}
}
