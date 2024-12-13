import java.util.ArrayList;
public class Train {
    FuelType fuelType;
    double fuelCapacity; 
    int nCars;
    int nPassengers;
    private ArrayList <Car> carList; 
    Engine e;
    int totalCapacity; 

/**
 * Constructor for Car 
 * @param fuelType
 * @param fuelCapacity
 * @param nCars
 * @param passengerCapacity
 */

//Constructor 
    Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
    e = new Engine(fuelType, nCars, passengerCapacity);
    carList = null;
    this.fuelType = fuelType;
    this.fuelCapacity = fuelCapacity;
    this.nCars = nCars;
}
/**
 * Prints Kind of fuel 
 * @return getEngine 
 */

//Accessors
public Engine getEngine(){
    System.out.println("Your engine type is: " + this.e);
    return this.e;
}
/**
 * Gets the car 
 * @return i 
 */
public Car getCar(int i){
    System.out.println(this.carList.get(i));
    return this.carList.get(i);
}
/**
 * Gets max capacity 
 * @return maxCapacity 
 */
public int getMaxCapacity(){
    totalCapacity = 0;
    for (int i = 0; i < nCars; i++) {
        totalCapacity += getCar(i).getMaxCapacity();
    }

    return totalCapacity;
}
/**
 * Gets seats remaining 
 * @return totalCapacity - nPassengers 
 */
public int seatsRemaining(){
    System.out.println(this.totalCapacity - this.nPassengers);
    return this.totalCapacity - this.nPassengers; 
}   
/**
 * Prints manifest 
 */
public void printManifest (){

    for (int i = 0; i < nCars; i++) {
       getCar(i).printManifest();
    }
}
/**
 * makes new train and allows users to get information about the train 
 * @param args
 */

public static void main(String[] args) {
    Train train = new Train(null, 100, 3, 5);
    train.getEngine();
    train.getCar(3);
    train.getMaxCapacity();
    train.seatsRemaining();
    train.printManifest();
}
}
