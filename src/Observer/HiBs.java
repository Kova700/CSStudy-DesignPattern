package Observer;


import java.util.ArrayList;
import java.util.List;

public class HiBs implements Coach {
    private List<Crew> crews = new ArrayList<>();

    public void orderStudy(String text){
        System.out.println("HiBs가 공부를 명령하다.");
        NotifyCrew("다음주까지 " + text + " 공부해오세요.");
    }

    public void orderCheckRequest(String PRname){
        System.out.println("HiBs가 PR확인을 요청했다.");
        NotifyCrew(PRname +" 로 PR날렸으니 확인해주세요.");
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
        crew.knowSubscribe();
    }

    @Override
    public void unscribe(Crew crew) {
        crews.remove(crew);
        crew.knowUnsubscribe();
    }

    @Override
    public void NotifyCrew(String msg) {
        crews.forEach(crew -> crew.receiveMsg(msg));
    }
}
