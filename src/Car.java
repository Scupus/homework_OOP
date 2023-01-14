import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;
    private final long id = count;
    private static long count = 1L;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public static long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Машина №" + id + "; марка:" + brand + "; модель:" + model + "; объем двигателя: " + engineVolume +
                "; цвет: " + color + "; год выпуска: " + year + "; страна производитель - " + country + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && year == car.year && id == car.id && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country, id);
    }

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        count++;
        if (brand == null || brand.isEmpty() || brand.equals("")) {
            this.brand = "Вentley";
        }
        if (model == null || model.isEmpty() || model.equals("")) {
            this.model = "V66";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.6f;
        }
        if (color == null || color.isEmpty() || color.equals("")) {
            this.color = "Белый";
        }
        if (year <= 0 || year > 2023) {
            this.year = 2000;
        }
        if (country == null || country.isEmpty() || country.equals("")) {
            this.country = "Англия";
        }
    }
}

