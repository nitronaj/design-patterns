package beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf";
	}

	public double cost() {
		switch (getSize()) {
			case GRANDE:
				return 1.05;
			case VENTI:
				return .90;
			case TALL:
			default:
				return .8;
		}
	}
}
