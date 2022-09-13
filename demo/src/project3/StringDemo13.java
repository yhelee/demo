package project3;

import java.util.Scanner;

public class StringDemo13 {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法，不需要变量接收他的值，可以继续调用其他方法
        int length = getString().substring(1).replace("A", "Q").length();
        System.out.println(length);

    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();
        return str;
    }
}
