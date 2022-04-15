package PrakArrayList;
import java.util.ArrayList;

public class CarData {
    public static ArrayList<Car> carList= new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType,polNum,merk));
    }
    public void listOfCar(){
        System.out.println("-------------------------------");
        System.out.println("    DAFTAR MOBIL");
        System.out.println("-------------------------------");
        for (Car wkwk : CarData.carList) {
            System.out.println("TIPE MOBIL  : " + wkwk.getCarType());
            System.out.println("NO.POLIS    : " + wkwk.getPolNum());
            System.out.println("MERK MOBIL  : " + wkwk.getMerk());
            System.out.println("-------------------------------");
        }
    }
}
