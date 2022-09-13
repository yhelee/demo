package project4;

//包装类：
//byte --> Byte, short --> Short, char --> Character, int --> Integer

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //jdk5以后，int和Integer可以互相转换
        list.add(1);
        list.add(2);
    }
}
