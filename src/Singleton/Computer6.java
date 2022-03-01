package Singleton;

/*Enum 이용*/
/*
객체를 기본 클래스로 정의하는게 아닌 Enum으로 정의하여 사용하는 유형으로
복잡한 직렬화나 리플렉션 상황에도 직렬화가 자동으로 지원된다는 이점이 있다.
(enum 타입은 기본적으로 직렬화 가능하므로 Serializable 인터페이스를 구현할 필요가 없고, 리플렉션 문제도 발생하지 않는다.
인스턴스가 JVM 내에 하나만 존재한다는 것이 100% 보장 되므로, Java에서 싱글톤을 만드는 가장 좋은 방법으로 권장된다.)
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

/*Enum 을 사용한 싱글톤 패턴은 Lazy Loading이 아니라는 단점을 가지지만 강력한 네가지 장점이 있다.

1.구현이 쉽다.
2.Enum은 태생자체가 스레드 세이프하게 구현되었다.
(그렇다고 Enum 내부에 사용자가 구현하는 메소드들도 스레드 세이프가 보장되는 것은 아니다.)
3.직렬화/역직렬화에 대한 처리가 필요없다.
4.Reflaction 공격을 방어할 수 있다.*/

/*그 어떤 형태의 싱글톤이라도 Reflection 의 setAccessible(true) 를 사용하면
모든 private 생성자, 메소드에 접근이 가능해진다. 그래서 생성자의 접근지정자가 Private로 되어있다 하더라도
직접 생성자를 호출해서 다른 인스턴스를 생성할 수 있다.*/

/*Enum싱글톤이 리플렉션과 직렬화에도 객체의 유일성을 보장해주는 이유 (지식이 짧은 관계로 링크로 대체)
* https://scshim.tistory.com/361 */