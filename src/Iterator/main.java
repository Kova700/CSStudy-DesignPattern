package Iterator;

public class main {
    public static void main(String[] args) {


        ParkingLot parkingLot = new ParkingLot(3);
        ParkingLot2 parkingLot2 = new ParkingLot2();

        parkingLot.appendCar(new Car("아반떼"));
        parkingLot.appendCar(new Car("소나타"));
        parkingLot.appendCar(new Car("K5"));

        parkingLot2.appendCar(new Car("아반떼 2"));
        parkingLot2.appendCar(new Car("소나타 2"));
        parkingLot2.appendCar(new Car("K5 2"));


        CustomIterator iterator = parkingLot.customIterator();
        while (iterator.hasNext()){
            Car car = (Car) iterator.next();
            System.out.println(car.getCarType());
        }

        System.out.println("---------------------------------------------------------------------------------------------");


        CustomIterator iterator2 = parkingLot2.customIterator();
        while (iterator2.hasNext()){
            Car car = (Car) iterator2.next();
            System.out.println(car.getCarType());
        }

        System.out.println("=============================================================================================");

        //Iterator를 사용하지 않았다면 출력 양식이 같지 않아서
        //아래와 같이 두 종류의 반목문을 통해서 출력해야한다.
        //출력을 담당하는 Iterator를 따로 만들어 줌으로써 출력하고자 하는 객체의 형식이 달라도
        //Iterator를 통해서 통일된 방식으로 출력할 수 있다.
        for (int i=0; i< parkingLot.Cars.length; i++){
            Car car = parkingLot.getCar(i);
            System.out.println(car.getCarType());
        }

        System.out.println("---------------------------------------------------------------------------------------------");

        for (int i=0; i< parkingLot2.Cars.size(); i++){
            Car car = parkingLot2.getCar(i);
            System.out.println(car.getCarType());
        }

    }
}
