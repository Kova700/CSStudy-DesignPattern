package Prototype;

import java.util.List;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employees emps = new Employees();

        //DB 끌어오기
        emps.loadData();
        
        //객체 복사
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("MIN");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("CHANG");

        //독립된 데이터 리스트출력됨을 확인할 수 있다.
        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);

        /*만약 Employees 클래스에서 clone()을 제공하지 않았다면,
        DB로부터 매번 employee 리스트를 직접 가져와야 했을 것이고,
        그로 인해 상당히 큰 비용이 발생했을 것이다.
        하지만 프로토타입을 사용한다면 1회의 DB 접근을 통해 가져온 데이터를 복사하여
        사용한다면 이를 해결할 수 있다.
        (객체를 복사하는 것이 네트워크 접근이나 DB 접근보다 훨씬 비용이 적다!!)*/

    }
}
