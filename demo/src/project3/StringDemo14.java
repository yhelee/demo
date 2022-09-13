package project3;

//键盘接收一个字符串，判断是否是对称字符串

//使用StringBuilder场景
//1.字符串拼接   2.字符串反转

import java.util.Scanner;

public class StringDemo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();

        //反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();

        if(str.equals(result)){
            System.out.println("为对称字符串");
        }else {
            System.out.println("不为对称字符串");
        }
    }
}
