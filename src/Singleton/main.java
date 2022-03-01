package Singleton;

public class main {
    public static void main(String[] args) {

        Computer1 testInstance11 = Computer1.getInstance();
        Computer1 testInstance12 = Computer1.getInstance();

        Computer2 testInstance21 = Computer2.getInstance();
        Computer2 testInstance22 = Computer2.getInstance();

        Computer3 testInstance31 = Computer3.getInstance();
        Computer3 testInstance32 = Computer3.getInstance();

        Computer4 testInstance41 = Computer4.getInstance();
        Computer4 testInstance42 = Computer4.getInstance();

        Computer5 testInstance51 = Computer5.getInstance();
        Computer5 testInstance52 = Computer5.getInstance();

        Computer6 testInstance61 = Computer6.UNIQUECOMPUTER; //객체가 2개 존재할 수가 없다.
        Computer6 testInstance62 = Computer6.UNIQUECOMPUTER;

        System.out.println(testInstance11);
        System.out.println(testInstance12);
        System.out.println("---------------------------------------------");
        System.out.println(testInstance21);
        System.out.println(testInstance22);
        System.out.println("---------------------------------------------");
        System.out.println(testInstance31);
        System.out.println(testInstance32);
        System.out.println("---------------------------------------------");
        System.out.println(testInstance41);
        System.out.println(testInstance42);
        System.out.println("---------------------------------------------");
        System.out.println(testInstance51);
        System.out.println(testInstance52);
        System.out.println("---------------------------------------------");
        System.out.println(testInstance61);
        System.out.println(testInstance62);
        System.out.println("---------------------------------------------");

        //클래스별 객체 주소값이 같음을 확인할 수 있다.

    }
}
