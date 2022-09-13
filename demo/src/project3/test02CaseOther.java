package project3;

//调整字符串
//给定两个字符串，A和B。
//A的旋转操作救是把A最左边的字符移动到最右边
//如果在若干次调整操作之后,A能变成B，那么返回true


import java.util.Scanner;

public class test02CaseOther {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String A = sc1.next();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个字符串");
        String B = sc2.next();


        if (A.equals(B)) {
            System.out.println("A和B相同");
        } else if (check(A, B)) {
            System.out.println("A能变成B");
        } else {
            System.out.println("A不能变成B");
        }
    }

    public static String move(String a) {
        //把字符串变为字符数组
        char[] chars = a.toCharArray();
        char tmp = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if(i == chars.length - 1){
                chars[i] = tmp;
            }else {
                chars[i] = chars[i + 1];
            }
        }
        String result = new String(chars);
        return result;
    }

    public static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            a = move(a);
            if (move(a).equals(b)) {
                return true;
            }
        }
        return false;
    }
}
