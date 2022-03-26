package Observer;

public interface Coach {
    void subscribe(Crew crew);
    void unscribe(Crew crew);
    void NotifyCrew(String msg);
}
