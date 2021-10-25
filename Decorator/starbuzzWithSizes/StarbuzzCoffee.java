
import starbuzzWithSizes.beverage.Beverage;
import starbuzzWithSizes.beverage.DarkRoast;
import starbuzzWithSizes.beverage.Espresso;
import starbuzzWithSizes.beverage.HouseBlend;
import starbuzzWithSizes.beverage.Beverage.Size;
import starbuzzWithSizes.condiment.Mocha;
import starbuzzWithSizes.condiment.Soy;
import starbuzzWithSizes.condiment.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		// DarkRoast double mocha with whip
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " Size: " + beverage2.getSize() + " $" + beverage2.cost());

		// DarkRoast double mocha with whip size GRANDE
		Beverage beverage3 = new DarkRoast();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3.setSize(Size.GRANDE);
		System.out.println(beverage3.getDescription() + " Size: " + beverage3.getSize() + " $" + beverage3.cost());

		// HouseBlend with soy latte mocha and whip
		Beverage beverage4 = new HouseBlend();
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
	}
}
