package com.cerebra.donation;
public class Test {
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public  static void main(String arcs[])
    {
        Test t = new Test();
//        t.setAge(10);
//        t.setName("Lohith Kumar");
        System.out.println("By Default value : "+t.getAge());
        System.out.println("By Default value : "+t.getName());


    }
}
