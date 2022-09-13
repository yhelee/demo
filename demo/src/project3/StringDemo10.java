package project3;

public class StringDemo10 {
    public static void main(String[] args) {
        String talk = "玩的真好，cnm,tmd";

        //定义一个敏感词库
        String[] arr = {"tmd","cnm","mlgb"};

        //循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        //替换
        System.out.println(talk);
    }
}
