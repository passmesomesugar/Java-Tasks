package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxiPark {
    private List<? extends Car> taxies;

    public TaxiPark(List<? extends Car> taxies) {
        this.taxies = taxies;
    }

    public List<? extends Car> getCars() {
        return taxies;
    }

    public List<TaxiCab> getTaxiCars() {
        List<TaxiCab> taxiCars = new ArrayList<>();
        for (Car taxi : taxies) {
            if (taxi instanceof TaxiCab) {
                taxiCars.add((TaxiCab) taxi);
            }
        }
        return taxiCars;
    }

    public List<TaxiVan> getTaxiVans() {
        List<TaxiVan> taxiVans = new ArrayList<>();
        for (Car taxi : taxies) {
            if (taxi instanceof TaxiVan) {
                taxiVans.add((TaxiVan) taxi);
            }
        }
        return taxiVans;
    }

    public TaxiPark sortByFuelConsumption() {
        Collections.sort(taxies, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getFuelConsumption() - o2.getFuelConsumption();
            }
        });
        return this;
    }

    public TaxiCab getMaxSpeedTaxiCab() {
        List<TaxiCab> taxies = getTaxiCars();
        TaxiCab taxiWithMaxSpeed = taxies.get(0);
        for (int i = 0; i < taxies.size(); i++) {
            if (taxies.get(i).getMaxSpeed() > taxiWithMaxSpeed.getMaxSpeed()) {
                taxiWithMaxSpeed = taxies.get(i);
            }
        }
        return taxiWithMaxSpeed;
    }

    public TaxiVan getMaxSpeedTaxiVan() {
        List<TaxiVan> vanTaxies = getTaxiVans();
        TaxiVan vanTaxiWithMaxSpeed = vanTaxies.get(0);
        for (int i = 0; i < vanTaxies.size(); i++) {
            if (vanTaxies.get(i).getMaxSpeed() > vanTaxiWithMaxSpeed.getMaxSpeed()) {
                vanTaxiWithMaxSpeed = vanTaxies.get(i);
            }
        }
        return vanTaxiWithMaxSpeed;
    }

    public int getTaxiCabsTotalCost() {
        List<TaxiCab> taxiCabs = getTaxiCars();
        int taxiCabsTotalCost = 0;
        for (int i = 0; i < taxies.size(); i++) {
            taxiCabsTotalCost = taxiCabsTotalCost + taxiCabs.get(i).getPrice();
        }
        return taxiCabsTotalCost;
    }

    public int getTaxiVansTotalCost() {
        List<TaxiVan> taxiVans = getTaxiVans();
        int taxiVansTotalCost = 0;
        for (int i = 0; i < taxies.size(); i++) {
            taxiVansTotalCost = taxiVansTotalCost + taxiVans.get(i).getPrice();
        }
        return taxiVansTotalCost;
    }

    @Override
    public String toString() {
        return "TaxiPark {" + "Car = " + taxies + "}";
    }
}
