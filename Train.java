import java.util.ArrayList;
public class Train {
    FuelType fuelType;
    double fuelCapacity; 
    int nCars;
    int nPassengers;
    private ArrayList <Car> carList; 
    Engine e;
    int totalCapacity; 


//Constructor 
    Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
    e = new Engine(fuelType, nCars, passengerCapacity);
    carList = null;
    this.fuelType = fuelType;
    this.fuelCapacity = fuelCapacity;
    this.nCars = nCars;
}

//Accessors
public Engine getEngine(){
    System.out.println("Your engine type is: " + this.e);
    return this.e;
}

public Car getCar(int i){
    System.out.println(this.carList.get(i));
    return this.carList.get(i);
}
public int getMaxCapacity(){
    totalCapacity = 0;
    for (int i = 0; i < nCars; i++) {
        totalCapacity += getCar(i).getMaxCapacity();
    }

    return totalCapacity;
}
public int seatsRemaining(){
    System.out.println(this.totalCapacity - this.nPassengers);
    return this.totalCapacity - this.nPassengers; 
}   

public void printManifest (){

    for (int i = 0; i < nCars; i++) {
       getCar(i).printManifest();
    }
}

public static void main(String[] args) {
    Train train = new Train(null, 100, 3, 5);
    train.getEngine();
    train.getCar(3);
    train.getMaxCapacity();
    train.seatsRemaining();
    train.printManifest();
}
}
