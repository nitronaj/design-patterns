package starbuzzWithSizes.beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public double cost() {
		switch (getSize()) {
			case GRANDE:
				return .89;
			case VENTI:
				return .79;
			case TALL:
			default:
				return .59;
		}
	}
}
