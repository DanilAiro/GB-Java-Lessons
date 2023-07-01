package Seminar6;

import java.util.Date;

public class Cat {
    private Integer id;
    private String name;
    private Integer age;
    private Sex sex;
    private Date birthday;
    private Poroda poroda;

    private boolean privit;
    private boolean sterialized;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, Poroda poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Poroda getPoroda() {
        return poroda;
    }

    public Sex getSex() {
        return sex;
    }

    public void privivka() {
        privit = true;
    }

    // public void privivka() {
    //     privit = true;
    // }

    public void meow() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name + " say meow");
        }
    }

    @Override
    public String toString() {
        return ("id: " + this.id + " name: " + this.name + " age: " + this.age + " sex: " + this.sex + " birthday: " + this.birthday + " poroda: " + this.poroda + " privit: " + this.privit + " sterialized: " + this.sterialized);
    }
}
