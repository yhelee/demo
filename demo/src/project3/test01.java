package project3;

//键盘录入一个字符串
//要求：1.长度为小于等于9  2.只能是数字  将数字变为罗马数字


import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个字符串");
            String str = sc.next();

            //校验字符串
            if (checkStr(str)) {
                String s = translateToRomaNum(str);
                System.out.println(s);
            } else {
                System.out.println("请输入正确的字符串");
                continue;
            }
        }

    }

    public static String translateToRomaNum(String str) {
        int x = 0;
        String nu = "";
        StringBuilder sb = new StringBuilder();
        String[] RomaNum = {"Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            x = c - 48;
            if (x == 0) {
                sb.append(nu);
            } else {
                sb.append(RomaNum[x - 1]);
            }
        }
        return sb.toString();
    }


    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }
}
