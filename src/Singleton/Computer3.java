package Singleton;

/*volatile 키워드를 사용함으로써 synchronized의 성능 저하 요인을 해결한 유형*/
/*
volatile 키워드로 인해 객체를 생성할 때 최초 1회에 한해 synchronized키워드를 사용함으로써
synchronized키워드의 문제점을 보완했다.
*/
public class Computer3 {
    private volatile static Computer3 UniqueComputer;
    private Computer3(){ }

    public static Computer3 getInstance(){
        if(UniqueComputer == null){
            synchronized(Computer3.class){
                if(UniqueComputer == null){
                    UniqueComputer = new Computer3();
                }
            }
        }
        return UniqueComputer;
    }
}

/*코드를 보면 null 체크를 synchronized 블록 밖에서 한번, 안에서 한번 하도록 되어있다.
밖에서 하는 체크는 이미 인스턴스가 생성된 경우 빠르게 인스턴스를 리턴하기 위함이고,
안에서 하는 체크는 인스턴스가 생성되지 않은 경우 단 한개의 인스턴스만 생성되도록 보장하기 위함이다.
안에서 체크하는 부분이 없으면 두개의 스레드가 동시에 접근할 때
그냥 순차적으로 인스턴스를 생성하도록 하는 수준 밖에 되지 않기 때문에,
synchronized 블록의 안팎으로 null 체크를 해줘야한다.*/

/*volatile 을 사용하지 않는 Double Checked Locking 방법에서 일어날 수 있는 문제
첫번째 스레드가 instance 를 생성하고 synchronized 블록을 벗어남.
두번째 스레드가 synchronized 블록에 들어와서 null 체크를 하는 시점에서,
첫번째 스레드에서 생성한 instance 가 working memory 에만 존재하고 main memory 에는 존재하지 않을 경우
또는, main memory 에 존재하지만 두번째 스레드의 working memory 에 존재하지 않을 경우
즉, 메모리간 동기화가 완벽히 이루어지지 않은 상태라면
두번째 스레드는 인스턴스를 또 생성하게 된다. 고로 volatile 키워드를 사용한다.*/

/* 자바 volatile 키워드는 자바 코드의 변수를 '메인 메모리에 저장' 할 것을 명시하기 위해 쓰인다.
정확히 말해서, 모든 volatile 변수는 컴퓨터의 메인 메모리로부터 읽히고,
volatile 변수에 대한 쓰기 작업은 메인 메모리로 직접 이루어진다. - CPU 캐시가 쓰이지 않는다.*/

/*volatile 키워드는 쓰레드들에 대한 변수의 변경의 가시성을 보장한다.
쓰레드가 변경한 값이 메인 메모리에 저장되지 않아서 다른 쓰레드가 이 값을 볼 수 없는 상황을 '가시성' 문제라 한다.*/

/*멀티쓰레드 어플리케이션에서의 non-volatile 변수에 대한 작업은 성능상의 이유로 CPU 캐시를 이용한다.
둘 이상의 CPU가 탑제된 컴퓨터에서 어플리케이션을 실행한다면, 각 쓰레드는 변수를 각 CPU의 캐시로 복사하여 읽어들인다. */

/*non-volatile 변수에 대한 작업은 JVM 이 메인 메모리로부터 CPU 캐시로 변수를 읽어들이거나,
CPU 캐시로부터 메인 메모리에 데이터를 쓰거나 할 때에 대한 어떠한 보장도 하지 않는다.*/

/*만일 volatile 키워드가 없다면, 객체가 생성되었다는 것을 언제 CPU 캐시에서 메인 메모리로 쓰일지 보장할 수 없다.
CPU 캐시의 UniqueComputer 변수와 메인 메모리의 UniqueComputer 변수가 다른 값을 가질 수 있다.*/