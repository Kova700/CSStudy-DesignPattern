package Singleton;

/*홀더 이용 (싱글톤의 초기화 문제에 대한 책임을 JVM에게 떠넘기는 유형)*/
/*
Computer 클래스에는 LazyHolder 클래스를 이용하는 변수가 없기 때문에
Computer 클래스 로딩 시 LazyHolder 클래스를 초기화하지 않는다.
LazyHolder 클래스는 Computer 클래스의 getInstance() 메소드에서
LazyHolder.INSTANCE를 참조하는 순간 클래스 로더에 의해 Class가 로딩되며 초기화가 진행된다.
고로 클래스를 사용하고자 할때 객체를 생성할 수 있고, 
클래스 로더가 Class를 로딩하고 초기화하는 시점은 Thread-Safe를 보장하기 때문에 
volatile이나 synchronized 같은 키워드가 없어도 thread-safe 하면서 성능도 보장하기 때문에
현재 가장 많이 쓰이고 있는 싱글톤 유형
*/
public class Computer5 {
    private Computer5() { }

    public static Computer5 getInstance() {
        return LazyHolder.UNIQUECOMPUTER;
    }

    private static class LazyHolder {
        private static final Computer5 UNIQUECOMPUTER = new Computer5();
    }
}
