package project3;

public class StringDemo12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        //变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
