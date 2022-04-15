package PrakArrayList;

public class CarMain {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider yohan = new CarRider("Bei Yohan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");
        CarRider kaguya = new CarRider("Kaguya Sama", 19, "083333333333");

        CarData data1 = new CarData();
        data1.addCar("SUV", "N 1111 AB", "Honda");
        data1.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data1.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data1.addCar("MPV", "B 4444 WA", "Toyota");

        data1.listOfCar();

        RentArchive data2 = new RentArchive();
        data2.Rent(ming, data1.carList.get(1), 9);
        data2.Rent(yohan, data1.carList.get(0), 3);
        data2.Rent(ling, data1.carList.get(1), 1);
        data2.Rent(kaguya, data1.carList.get(3), 5);

        System.out.println();
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");

        System.out.println();
        data2.info();
    }
}
