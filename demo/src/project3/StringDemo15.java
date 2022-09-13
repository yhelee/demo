package project3;

//需求：定义一个方法，把int数值中的数据，按照指定的格式拼接成一个字符串返回。


public class StringDemo15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = arrToString(arr);
        System.out.println(str);

    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i] + "]");
            }else {
                sb.append(arr[i]).append(" ,");
            }
        }
        return sb.toString();
    }
}
