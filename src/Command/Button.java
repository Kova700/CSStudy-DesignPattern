package Command;

//(호출자)
public class Button {
    //호출자(버튼)에는 기능을 담당하는 커맨드 연결 기능만 있고
    //기능에 대한 내용은 기술하지 않는다!
    //(코드 변경에 유연하게 대처하기 위해)
    private Command command;

    public Button(Command command) {
        setCommand(command);
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressed() {
        command.excute();
    }

    //이런식으로 짜면 Lamp의 코드가 바뀌면 Button에도 영향을 끼친다.
    //ex : Lamp에 기능이 추가/변경된다던지 등등
//    private Lamp lamp;
//
//    //Button 클래스의 생성자를 이용해 불을 켤 Lamp객체를 전달한다.
//    public Button(Lamp lamp){
//        this.lamp = lamp;
//    }
//    //pressed()가 호출되면 생성자를 통해 전달받은 Lamp객체의
//    //turnOn()를 호출해 불을 켠다.
//
//    public void pressed() {
//        lamp.turnOn();
//    }
}
