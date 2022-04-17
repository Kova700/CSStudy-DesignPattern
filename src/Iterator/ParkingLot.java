package Iterator;

public class ParkingLot implements Aggregate{
    public Car[] Cars;
    private int last = 0;

    public ParkingLot (int maxsize) {
        this.Cars = new Car[maxsize];
    }

    public Car getCar(int index){
        return Cars[index];
    }

    public void appendCar(Car car){
        this.Cars[last] = car;
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
