public class Passenger {
    private String name;
/**
 * Constructor for Passenger class 
 * @param name
 */
    public Passenger(String name) {
        this.name = name;
    }
/**
 * Gives you the passenger name 
 * @return name 
 */
    public String getName() {
        return this.name;
    }
/**
 * Allows you to add passenger to a car 
 * @param c
 * @return boardCar 
 */
    public Boolean boardCar (Car c) {
        return c.addPassenger(this);
    }
/**
 * Removes a passenger from a car 
 * @param c
 * @return getOffCar 
 */
    public Boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }
}
