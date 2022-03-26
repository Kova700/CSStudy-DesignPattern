package Observer;

public interface Crew {
    void knowSubscribe();
    void knowUnsubscribe();
    void receiveMsg(String msg);
}
