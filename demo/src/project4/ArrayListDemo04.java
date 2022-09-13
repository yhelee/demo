package project4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();

            //把name  age赋值
            s.setName(name);
            s.setAge(age);

            //添加到集合中
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }
    }
}
