import java.util.ArrayList;

    public class Car {
    //Array List attributes 
    private ArrayList < Passenger> passengerList; 
    private Integer maxCapacity; 
/** 
 * Constructor for Car class 
 */

//Constructor 
    public Car(String passengerList, Integer maxCapacity){
        this.maxCapacity = maxCapacity; 
        this.passengerList = new ArrayList<Passenger>(maxCapacity);
    }
//Getters 
/**
 * Gets max capacity 
 * @return maxCapacity 
 */
    public int getMaxCapacity() {
        return this.maxCapacity;
    }
/**
 * Gets seatsRemaining 
 * @return seatsRemaining 
 */
    public int seatsRemaining(){
        return this.maxCapacity - passengerList.size();
    }

//Methods 
/**
 * Sees if a passenger can be added then adds passenger to a car 
 * @param p
 * @return addPassenger 
 */
    public Boolean addPassenger(Passenger p){
    if (seatsRemaining()>0 && !this.passengerList.contains(p)) {
        passengerList.add(p); 
        return true;
    }
    return false;
    }

    public Boolean removePassenger(Passenger p){
    if (seatsRemaining()>0 && this.passengerList.contains(p)){
        passengerList.remove(p); 
        return true;
    }
    return false;
    }
/**
 * Prints list of all passengers in a set car 
 * @return passengerList
 */
   public ArrayList < Passenger> printManifest(){
    if(!passengerList.isEmpty()) {
        System.out.println(passengerList.toString());
    }
    else {
        System.out.println("This car is EMPTY.");
    }
    return passengerList;
   }
/**
 * Creates new cars and add/remover passengers 
 * @param args
 */
   public static void main(String[] args) {
    Car myCar = new Car(null, 5); 
    myCar.printManifest();
    Passenger p = new Passenger("Nina");
    Passenger p2 = new Passenger("Ari");
    myCar.addPassenger(p2);
    myCar.addPassenger(p);
    myCar.printManifest();
    myCar.removePassenger(p);
    myCar.printManifest();
   }
}