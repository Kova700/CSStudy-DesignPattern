package Singleton;

/*Enum 이용*/
/*
객체를 클래스로 정의하는게 아닌 Enum으로 정의하여 사용하는 유형으로
Enum 자체가 중복값을 허용하지 않음으로 객체의 개수가 확실하게 보장되고
복잡한 직렬화나 리플렉션 상황에도 직렬화가 자동으로 지원된다는 이점이 있다.
*/
public enum Computer6 {
    UNIQUECOMPUTER;
}

/* 사용 예제
* public enum SingletonEnum {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
public class EnumDemo {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}*/

/*Enum 을 사용한 싱글톤 패턴은 Lazy Loading 이 아니라는 단점을 가지지만 강력한 세가지 장점이 있다.

1.구현이 쉽다.
2.Enum 은 태생자체가 스레드 세이프하게 구현되었다.
(그렇다고 Enum 내부에 사용자가 구현하는 메소드들도 스레드 세이프가 보장되는 것은 아니다.)
3.직렬화/역직렬화 에 대한 처리가 필요없다.*/

/*그 어떤 형태의 싱글톤이라도 Reflection 의 setAccessible(true) 를 사용하면 모든 private 생성자, 메소드에 접근이 가능해진다.
*  직접 생성자를 호출해서 다른 인스턴스를 생성할 수 있다.*/