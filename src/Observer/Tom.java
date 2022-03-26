package Observer;

public class Tom implements Crew{
    @Override
    public void knowSubscribe() {
        System.out.println("Tom이 크루 가입을 인지했습니다.");
    }

    @Override
    public void knowUnsubscribe() {
        System.out.println("Tom이 크루 퇴출을 인지했습니다.");
        System.out.println("Tom이 울고 있습니다.");
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println("Tom이 " +'"'+msg+'"'+" 내용을 수신했습니다. ");
    }
}
