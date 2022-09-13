//模拟登录系统，字符串比较

package project3;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        String rightUsername = "yhelee";
        String rightPassword = "lee123";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String Username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            if (rightUsername.equals(Username) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else if (i == 2) {
                System.out.println("用户" + rightUsername + "被锁定");
            } else {
                System.out.println("登录失败，请输入正确的用户名和密码,您还有" + (2 - i) + "次机会");
            }
        }
    }
}
