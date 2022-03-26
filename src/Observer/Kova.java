package Observer;

public class Kova implements Crew{
    @Override
    public void knowSubscribe() {
        System.out.println("Kova가 크루 가입을 인지했습니다.\n");
    }

    @Override
    public void knowUnsubscribe() {
        System.out.println("Kova가 크루 퇴출을 인지했습니다.");
        System.out.println("Kova가 울고 있습니다.\n");
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println("Kova가 " +'"'+msg+'"'+" 내용을 수신했습니다. \n");
    }
}
