package OOP.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVenMachine implements VendingMachine {
    private List<HotDrink> hotDrinks;

    public HotDrinkVenMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrink(HotDrink drink) {
        hotDrinks.add(drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equalsIgnoreCase(name) &&
                    drink.getVolume() == volume &&
                    drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}