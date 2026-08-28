public class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String tranmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = tranmissionType;
    }
    public void startAC(){
        System.out.println("AC started of "+name);
    }
}
