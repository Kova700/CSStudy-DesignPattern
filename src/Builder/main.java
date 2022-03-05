package Builder;

public class main {
    public static void main(String[] args) {
        Book2 book = new Book2
                .Builder("인간관계론")
                .author("데일카네기")
                .publisher("현대지성")
                .contents("상대방의 이름은 그에게 있어서 모든 말 중에서 가장 달콤하고 중요한 말로 들린다는 점 명심하라.")
                .price("11,500원")
                .build();

        System.out.println(book.toString());
    }
}
