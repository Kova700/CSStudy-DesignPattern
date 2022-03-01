package Singleton;

/*Double Checked Locking기법을 사용해 synchronized의 성능 저하 요인을 해결한 유형*/
/*
Double Checked Locking기법을 사용해 객체를 생성할 때 최초 1회에 한해 synchronized키워드를 사용해
매번 synchronized키워드를 사용할때 생기는 성능저하요인을 해소했다.
하지만 Thread들의 캐시메모리에 저장된 정보가 서로 다를때 생기는 가시성 문제가 발생할 수 있음으로
객체 레퍼런스 변수에 volatile 키워드를 붙여줌으로써 가시성 문제를 해소했다.
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