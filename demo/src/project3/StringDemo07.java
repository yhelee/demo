package project3;

//手机号屏蔽
//String substring(int beginIndex,int endIndex) 截取、包头不包尾，包左不包右  只有返回值才是截取的小串，不影响原字符串
//String substring(int beginIndex) 截取到末尾

public class StringDemo07 {
    public static void main(String[] args) {
        //获取一个手机号
        String phoneNum = "15623151268";

        //截取手机号前三位
        String start = phoneNum.substring(0, 3);
        //截取后四位
        String end = phoneNum.substring(7);

        String result = start + "****" + end;
        System.out.println(result);
    }
}
