package Command;

public class main {
    public static void main(String[] args) {

//        아래와 같이 Button과 Lamp를 바로연결해버리면 객체간 의존성이 생긴다.
//        Lamp와 Button사이에 Command라는 중간자를 만들어주면 의존성이 사라진다.
//        ==> Lamp의 코드가 변경되어도 Button의 코드에는 영향을 끼치지 않는다.
//        Lamp lamp = new Lamp();
//        Button lampButton = new Button(lamp);
//        lampButton.pressed();

        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlramStartCommand(alarm);

        //버튼에는 커맨드만 연결하지 기능객체를 직접적으로 넣지않는다.
        Button btn1 = new Button(lampOnCommand);
        btn1.pressed();
        Button btn2 = new Button(alarmStartCommand);
        btn2.pressed();

        btn2.setCommand(lampOnCommand);
        btn2.pressed();

    }
}
