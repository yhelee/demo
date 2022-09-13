package project3;
//敏感词替换
//String replace(旧值，新值)  返回值为替换后的结果

public class StringDemo09 {
    public static void main(String[] args) {
        String talk = "玩的真好，cnm";

        //替换
        String result = talk.replace("cnm", "***");
        System.out.println(result);
    }
}
