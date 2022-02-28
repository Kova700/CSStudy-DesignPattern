package Singleton;

/*synchronized키워드를 사용함으로써 객체의 개수를 보장한 유형*/
/*
객체의 개수가 하나임은 보장 되었지만 객체를 호출할 때마다
synchronized키워드를 사용함으로 치명적인 성능 저하가 발생함
(우리가 원하는 것은 싱글톤으로 인스턴스가 하나만 생성되게 하는 것이지,
메소드 호출시마다 락을 걸어 성능을 저하시키려는 것이 아니다.
일단 하나의 인스턴스만 생성되고 나면 그 다음부터는 synchronized 가 필요없다.)
*/

public class Computer2 {
    private static Computer2 UniqueComputer;
    private Computer2(){ }

    //synchronized 키워드 사용
    public static synchronized Computer2 getInstance() {
        if(UniqueComputer == null){
            UniqueComputer = new Computer2();
        }
        return UniqueComputer;
    }

}
