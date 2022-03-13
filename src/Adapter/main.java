package Adapter;

public class main {
    public static void main(String[] args) {
        JavaClass javaClass = new JavaClass();

        KotlinClass kotlinClass = new KotlinClass();
        Java kotlinAdapter = new KotlinAdapter(kotlinClass);

        System.out.println("JavaClass-----------------");
        javaClass.JavaCode();
        javaClass.JavaRun();

        System.out.println("\nKotlinClass----------------");
        kotlinClass.KotlinCode();
        kotlinClass.KotlinRun();

        //어댑터를 이용해서 Java인터페이스를 이용해서 Kotlin인터페이스에
        //있는 메소드를 사용했다. ( KotlinAdapter의 데이터 타입 = Java다!)
        System.out.println("\nKotlinAdapter---------------");
        kotlinAdapter.JavaCode();
        kotlinAdapter.JavaRun();
    }
}
