package Builder;

public class Book2 {

    private final String bookTitle;
    private final String author;
    private final String price;
    private final String publisher;
    private final String contents;

    //일반적으로 각 클래스의 Builder클래스는 클래스 내부에 정의한다.
    //Book클래스 객체가 존재하지 않을때 호출할 수 있어야하니까 public static으로 선언
    public static class Builder {

        private String bookTitle = "";
        private String author = "";
        private String price = "";
        private String publisher = "";
        private String contents = "";

        public Builder() {} //확인

        public Builder bookTitle(String bookTitle){
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public Builder price(String price){
            this.price = price;
            return this;
        }

        public Builder publisher(String publisher){
            this.publisher = publisher;
            return this;
        }

        public Builder contents(String contents){
            this.contents = contents;
            return this;
        }

        public Book2 build(){
            return new Book2(this);
        }
    }

    public Book2(Builder builder) {
        bookTitle = builder.bookTitle;
        author = builder.author;
        publisher = builder.publisher;
        contents = builder.contents;
        price = builder.price;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", publisher='" + publisher + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
