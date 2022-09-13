package project2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);

            cars[i] = c;
        }
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.getBrand()+"、"+car.getPrice()+"、"+car.getColor());
        }
    }
}
