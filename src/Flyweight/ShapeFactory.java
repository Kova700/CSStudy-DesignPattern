package Flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getCircle(String color) { //랜덤으로 뽑힌 색 가져옴
        Circle circle = (Circle) circleMap.get(color); //해당 색의 circle이 이미 만들어졌는지 확인 

        //만들어진 객체가 없다면 객체 생성
        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("=== 새로운 객체 생성 : " + color + "색 원 ====");
        }
        //이미 만들어진 객체가 있다면 그 객체 다시 리턴
        return circle;
    }
}
