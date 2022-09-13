package test;

import java.util.Random;

public class Role {
    private String name;
    private int HP;
    private char gender;
    private String face;

    String[] boyface = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlface = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s"
    };

    String[] injureds_desc = {
            "结果%s退了半步，毫发无伤",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛的弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔到在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果【轰】的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };


    public Role(String name) {
        this.name = name;
    }

    public Role(String name, int HP, char gender) {
        this.name = name;
        this.HP = HP;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyface.length);
            this.face = boyface[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlface.length);
            this.face = girlface[index];
        } else {
            this.face = "面目狰狞";
        }
        this.face = face;
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
    public void attack(Role role) {
        Random r = new Random();

        //攻击描述
        int index = r.nextInt(attacks_desc.length);
        String method = attacks_desc[index];
        System.out.printf(method,this.getName(),role.getName());
        System.out.println();

        //计算造成的伤害
        int hurt = r.nextInt(20) + 1;

        //修改被打人的血量
        int remainHP = role.getHP() - hurt;
        //对剩余血量做验证
        remainHP = remainHP - hurt < 0 ? 0 : remainHP;
        role.setHP(remainHP);

        //受伤描述
        if(remainHP > 90){
            System.out.printf(injureds_desc[0],role.getName());
        } else if (remainHP > 80 && remainHP <= 90) {
            System.out.printf(injureds_desc[1],role.getName());
        }else if (remainHP > 70 && remainHP <= 80) {
            System.out.printf(injureds_desc[2],role.getName());
        }else if (remainHP > 60 && remainHP <= 70) {
            System.out.printf(injureds_desc[3],role.getName());
        }else if (remainHP > 40 && remainHP <= 60) {
            System.out.printf(injureds_desc[4],role.getName());
        }else if (remainHP > 20 && remainHP <= 40) {
            System.out.printf(injureds_desc[5],role.getName());
        }else if (remainHP > 10 && remainHP <= 20) {
            System.out.printf(injureds_desc[6],role.getName());
        }else {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getHP());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }
}
