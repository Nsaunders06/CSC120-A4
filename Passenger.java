public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Boolean boardCar (Car c) {
        return c.addPassenger(this);
    }

    public Boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }
}
