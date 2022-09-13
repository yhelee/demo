package com.yhelee;

import java.util.Random;

public class Role {
    private String name;
    private int HP;

    public Role(String name) {
        this.name = name;
    }

    public Role(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    //定义一个方法用于发动攻击
    public void attack(Role role){
        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //修改被打人的血量
        int remainHP = role.getHP() - hurt;
        //对剩余血量做验证
        remainHP = remainHP - hurt < 0 ? 0 : remainHP;
        role.setHP(remainHP);

        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+"一下，造成了"+hurt+"点伤害，"+role.getName()+"还剩下"+remainHP+"点血");
    }
}
