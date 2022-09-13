package com.yhelee;

public class gameTest {
    public static void main(String[] args) {
        Role r1 = new Role("lee",100);
        Role r2 = new Role("zhang",100);

        while (true){
            r1.attack(r2);
            if(r2.getHP() == 0){
                System.out.println(r1.getName()+" K.O "+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getHP() == 0){
                System.out.println(r2.getName()+" K.O "+r1.getName());
                break;
            }
        }
    }
}
