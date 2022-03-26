package Observer;

public class main {
    public static void main(String[] args) {
        HiBs hiBs = new HiBs();
        Tom tom = new Tom();
        Kova kova = new Kova();

        hiBs.subscribe(tom);
        hiBs.subscribe(kova);

        hiBs.orderStudy("Docker");

        hiBs.unscribe(kova);

        hiBs.orderCheckRequest("Kakao,Google Login");


    }
}
