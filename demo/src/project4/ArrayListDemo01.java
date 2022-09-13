package project4;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        //泛型：限定集合中存储数据的类型
//        ArrayList<String> list = new ArrayList<String>();    jdk7以前

        //ArrayList是Java写好的类，底层进行了处理
        //打印对象不是地址值，而是集合中存储的数据内容，在展示时会通过[]包裹
        ArrayList<String> list = new ArrayList<>();
    }
}
