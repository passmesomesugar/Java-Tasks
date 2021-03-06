package collections;

import collections.taxiTypes.*;

public class TaxiCab extends Car {
	private TaxiType type;

	public TaxiCab(String model, int fuelConsumption, int price, int maxSpeed, TaxiType type) {
		super(model, fuelConsumption, price, maxSpeed);
		this.type = type;
	}

	public TaxiType getTaxiType() {
		return type;
	}

	public void setTaxiType(TaxiType type) {

		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString().replace(".", ", type=" + type);
	}
}
