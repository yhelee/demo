package project4;

import java.util.ArrayList;

public class ArrayListDemo05 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        //创建3个用户对象
        User u1 = new User("001","zhangsan","123456");
        User u2 = new User("002","lisi","12345678");
        User u3 = new User("003","wangwu","1234qwer");

        //添加到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法
        if(checkout("001",list)){
            System.out.println("存在");
        }else
        {
            System.out.println("不存在");
        }
    }

    public static boolean checkout(String id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
