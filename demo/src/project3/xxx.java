package project3;

public class xxx {
    public static void main(String[] args) {
        String xx = "123456";
        char c = xx.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(xx);
        String xxx = sb.substring(1);
        xxx += c;
        System.out.println(xxx);
    }
}
