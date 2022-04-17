package Iterator;

public class ParkingLotIterator implements CustomIterator{
    private Aggregate aggregate;
    private ParkingLot parkingLot;
    private ParkingLot2 parkingLot2;
    private int index;

    public ParkingLotIterator(Aggregate aggregate) {
        super();
        this.aggregate = aggregate;
        if(aggregate instanceof ParkingLot){
            parkingLot = (ParkingLot) aggregate;
        }else if (aggregate instanceof ParkingLot2){
            parkingLot2 = (ParkingLot2) aggregate;
        }else{
            System.out.println("ParkingLot , ParkingLot2 둘 다 아님");
        }
    }

    @Override
    public boolean hasNext() {
        if(parkingLot2 == null){
            return index <  parkingLot.getLength();     //현재 HEAD의 위치와 배열의 크기 비교
        }else if (parkingLot == null){
            return index <  parkingLot2.getLength();    //현재 HEAD의 위치와 ArrayList의 크기 비교
        }
        System.out.println("ParkingLot , ParkingLot2 둘 다 아님");
        return false;
    }

    @Override
    public Object next() {
        if(parkingLot2 == null){
            Car car = parkingLot.getCar(index);
            index++;
            return car;
        }else if (parkingLot == null){
            Car car = parkingLot2.getCar(index);
            index++;
            return car;
        }

        System.out.println("ParkingLot , ParkingLot2 둘 다 아님");
        return "123";
    }
}
