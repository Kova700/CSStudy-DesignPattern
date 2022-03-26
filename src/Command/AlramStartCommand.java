package Command;

//커맨드 ( Alram과 Button사이 의존성 제거 )
public class AlramStartCommand implements Command {
    //커맨드에는 해당 기능을 담당하는 수신자의 객체를 가지고 있으며
    //해당 객체를 통해 기능을 수행한다.
    private Alarm alarm;

    public AlramStartCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void excute() {
        alarm.start();
    }
}
