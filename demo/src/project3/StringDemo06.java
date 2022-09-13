package project3;

import java.util.Scanner;

public class StringDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("请输入正确的金额");
            }
        }

        //定义一个变量，用来表示钱的大写
        String moneyStr = "";

        //得到money里的每一位数字,再转成中文
        while (true) {
            //从右往左取值
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            //拼接
            moneyStr = capitalNumber + moneyStr;
            //去掉取掉的值
            money = money / 10;
            //如果每一位的数字都取到了，money会为零，此时跳出循环
            if (money == 0) {
                break;
            }
        }
        //补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        String result = "";

        //插入单位
        String[] arr = {"佰", "拾", "万", "千", "佰", "拾", "元"};
        for (int i = 0; i < moneyStr.length(); ++i) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
            //也可以直接打印
            //System.out.println(c);
            //System.out.println(arr[i]);即可
        }
        System.out.println(result);
    }

    //定义方法转换大小写
    public static String getCapitalNumber(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }
}
