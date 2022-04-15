package PrakArrayList;

public class CarRent {
    public CarRider rider;
    public Car car;
    public int RentDur;

    public CarRent(CarRider rider, Car car, int RentDur){
        this.RentDur = RentDur;
        this.car = car;
        this.rider = rider;
    }

    public CarRider getRider(){
        return rider;
    }

    public Car getCar(){
        return car;
    }

    public int getRentDur(){
        return RentDur;
    }

    String getPolNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
