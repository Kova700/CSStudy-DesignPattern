package Command;

//커맨드 ( Lamp와 Button사이 의존성 제거 )
public class LampOnCommand implements Command {
    //커맨드에는 해당 기능을 담당하는 수신자의 객체를 가지고 있으며
    //해당 객체를 통해 기능을 수행한다.
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void excute() {
        lamp.turnOn();
    }
}
