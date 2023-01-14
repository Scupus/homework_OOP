public class CarList {
    private Car[] cars = new Car[10];

    {
        cars[0] = new Car("Lada", "Granta", 1.7f, "Желтый", 2015, "Россия");
        cars[1] = new Car("AUDI", "A8 50 L TDI", 3.0f, "Черный", 2020, "Германия");
        cars[2] = new Car("BMW", "Z8", 3.0f, "Черный", 2021, "Германия");
        cars[3] = new Car("Kia", "Sportage 4", 2.4f, "Красный", 2018, "Южная корея");
        cars[4] = new Car("", "Avante", -1.2f, "", -15, "");
    }

    public void printCarList() {
        for (int i = 0; i < Car.getCount(); i++) {
            System.out.println(cars[i]);
        }
    }
}
