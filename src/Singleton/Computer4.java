package Singleton;

/*처음부터 정적변수에 객체를 만들어서 바로 초기화 하는 유형*/
/*
객체를 생성해놨지만 객체를 사용하지 않는다면 메모리 낭비가 될 수 있는 유형임으로
객체를 무조건 사용하는 상황에서는 이 유형이 좋은 선택지가 된다.
*/
public class Computer4 {
    private static Computer4 UniqueComputer = new Computer4();
    private Computer4() { }

    public Computer4 getInstance() {
        return UniqueComputer;
    }
}
