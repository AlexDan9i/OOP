package OOP.HomeWork1;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", volume=" + getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}