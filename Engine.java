public class Engine {
// Attributes 
private FuelType energy; // shows the kind of fuel needed 
private Double maxFuelLevel; // shows the max fuel level 
private Double currentFuelLevel; // shows the current fuel level 

// constructor 
/**
 * Constructor of the Engine class 
 * @param energy
 * @param maxAmt
 * @param currentAmt
 */
public Engine (FuelType energy, double maxAmt, double currentAmt) {
    this.energy = energy; 
    this.maxFuelLevel = maxAmt; 
    this.currentFuelLevel = currentAmt; 

}
/**
 * Takes in the fuel type form the FuelType file 
 * @return energy 
 */
// Getter for the fuelType 
public FuelType getFuelType (){
    return this.energy;
}
/**
 * Finds the current fuel level 
 * @return currentFuelLevel 
 */
// Getter for the currentFuelLevel
public Double getCurrentFuelLevel(){
    return this.currentFuelLevel;
}

/**
 * Gets the maxFuelLevel 
 * @return maxFuelLevel 
 */
// Getter for maxFuelLevel
public Double getMaxFuelLevel(){
    return this.maxFuelLevel;
}


// methods 
/**
 * Fills the cars fuel level to full 
 * @param maxAmt
 */
//Takes the fuel amount and resets it to the max fuel level 
public void refuel(double maxAmt) {
    this.currentFuelLevel = maxAmt;
}

//Gives information about the train when it tries to go 
// Prints the remaining fuel level 
// Returns true if fuel level>0 and false if else 
/**
 * Makes the car go when their is fuel and print out the current fuel level 
 * @return remainingFuel 
 */
public Boolean go() {
    double currentAmt = this.getCurrentFuelLevel();

    boolean remainingFuel; 
    if (currentAmt > 0) {
        currentFuelLevel--;
        remainingFuel = true;
        
    } else {
        remainingFuel = false;
    }
    System.out.println(currentAmt);
    return remainingFuel;
}
/**
 * Makes car go and print sounds as it goes and then an error message when it runs out of fuel 
 * @param args
 */
public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}


}

