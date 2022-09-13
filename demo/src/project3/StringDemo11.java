package project3;

//StringBuilder可以看成一个容器，创建之后里面的内容是可变的
//作用：提高字符串的操作效率


public class StringDemo11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        //1.添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);

        //2.反转
        sb.reverse();

        //3.获取长度
//        int length = sb.length();

        //打印
        //因为StringBuilder是Java已经写好的类
        //Java在底层对他做了一些特殊处理，打印对象不是地址值
//        System.out.println(sb);
//        System.out.println(length);
    }
}
