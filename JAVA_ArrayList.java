package juhwan;

import java.util.ArrayList;

public class JAVA_ArrayList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(); //ArrayList 선언 , 크기가 없어도 된다.
        list.add("A"); // 1 .add : ArrayList에 값을 넣어줌
        System.out.println("list = " + list);


        list.remove(0); // 2 .remove(index) : index에 있는 값 삭제
        System.out.println("list = " + list);


        list.add("A");
        System.out.println(list.get(0)); // 3 .get(index) : index에 있는 값 호출


        System.out.println(list.indexOf("A")); // 4 .indexOf(Object) : 값을 기준으로 index 호출 , 값이 없으면 -1 리턴


        System.out.println(list.size()); // 5 .size : list의 크기 반환


        list.add("B");
        list.add("C");
        System.out.println(list.contains("B"));
        System.out.println(list.contains("D"));// 6 .contains : list에 있는 값 => true , 없으면 false

    }
}
