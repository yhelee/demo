package project3;

//StringJoiner
//作用：提高字符串的操作效率，而且代码编写非常简单，但是市面少有人用

import java.util.StringJoiner;

public class StringDemo16 {
    public static void main(String[] args) {
        //创建对象，指定间隔符
        StringJoiner sj = new StringJoiner(", ","[","]");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int length = sj.length();
        System.out.println(length);

        System.out.println(sj);

        String str = sj.toString();
        System.out.println(str);
    }
}
