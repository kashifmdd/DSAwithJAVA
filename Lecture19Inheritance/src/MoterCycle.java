public class MoterCycle extends Vehicle {
    public String handleBArStyle;
    public String suspensorType;

    MoterCycle(String name, String model, int noOfTyres, String handleBArStyle, String suspensorType){
        super(name, model, noOfTyres);
        this.handleBArStyle = handleBArStyle;
        this.suspensorType = suspensorType;
    }
    public void wheelie(){
        System.out.println("MotorCycle is doing Wheelie! "+name);
    }
}
