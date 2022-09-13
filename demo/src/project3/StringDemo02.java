//遍历字符串
//puclic char charAt(int index):根据索引返回字符
//puclic int length()

package project3;

import java.util.Scanner;

public class StringDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        for(int i = 0; i < str.length();i++){
            char chs = str.charAt(i);
            System.out.println(chs);
        }
    }
}
