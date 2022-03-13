package Prototype;

import java.util.ArrayList;
import java.util.List;

//복사(Clone)을 위해 Cloneable인터페이스 구현
public class Employees implements Cloneable{

    //직원리스트
    private List<String> empList;

    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }

    //설명 간단하게 하기위에 DB끌어오는거 쉽게 표현
    public void loadData(){
        empList.add("GUK");
        empList.add("BYOUNG");
        empList.add("TOM");
        empList.add("CHANG");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //옮겨담은 리스트 객체 리턴
        List<String> temp = new ArrayList<String>();
        for(String s : this.empList){
            temp.add(s);
        }
        return new Employees(temp);
    }
}
