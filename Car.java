public class Car {
//Array List attributes 
private ArrayList < String > passengerList; 
private Integer maxCapacity; 

//Constructor 
    public Car(String passengerList, Integer maxCapacity){
        this.maxCapacity = maxCapacity; 
        this.passengerList = new ArrayList<String>(maxCapacity);
    }
//Methods 
    public int getMaxCapacity() {
        return this.maxCapacity;
    }
    public int seatsRemaining(){
        return this.maxCapacity - passengerList.size();
    }

    public void addPassenger(Passenger p){
    if (seatsRemaining()>0 && this.passengerList.contains(p)) {
        passengerList.add(p); 
    }
    }

    public void removePassenger(Passenger p){
    if (seatsRemaining()>0 && this.passengerList.contains(p)){
        passengerList.remove(p); 

}