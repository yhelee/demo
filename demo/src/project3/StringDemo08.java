package project3;

//身份证信息查看

public class StringDemo08 {
    public static void main(String[] args) {
        String idNum = "421087199912263716";

        String year = idNum.substring(6, 10);
        String month = idNum.substring(10, 12);
        String day = idNum.substring(12, 14);
        System.out.println("出生年月日为：" + year + "年" + month + "月" + day + "日");

        char gender = idNum.charAt(16);//'3' --> 3  利用ascii码转换
        //'0' --> 48
        //'1' --> 49
        //'2' --> 50
        //'3' --> 51
        //'4' --> 52
        //'5' --> 53
        //'6' --> 54
        //'7' --> 55
        //'8' --> 56
        //'9' --> 57
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }


    }
}
