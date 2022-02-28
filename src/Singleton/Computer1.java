package Singleton;

/*가장 고전적인 Singleton 유형*/
/*
멀티 스레딩 환경에서 getComputer1()에 동시에 접근하게 되면
객체가 다수 생성되는 불상사가 발생함
*/

public class Computer1 {
    // Computer클래스의 유일한 인스턴스를 저장하기 위한 정적 변수
    private static Computer1 UniqueComputer;
    //외부에서의 직접적인 접근 막음 Private
    private Computer1() { }

    // 자기 자신의 인스턴스를 외부에 제공.
    public static Computer1 getInstance() {
        //현재 생성된 객체 있는지 체크
        if(UniqueComputer == null){
            UniqueComputer = new Computer1();
        }
        return UniqueComputer;
    }
}
