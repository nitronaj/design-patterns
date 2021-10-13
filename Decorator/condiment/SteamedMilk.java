package condiment;

import beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
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
