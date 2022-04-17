package Iterator;

import java.util.ArrayList;

public class ParkingLot2 implements Aggregate{
    public ArrayList<Car> Cars;
    private int last = 0;

    public ParkingLot2 () {
        this.Cars = new ArrayList();
    }

    public Car getCar(int index){
        return Cars.get(index);
    }

    public void appendCar(Car car){
        this.Cars.add(car);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public CustomIterator customIterator() {
        return new ParkingLotIterator(this);
    }
}
