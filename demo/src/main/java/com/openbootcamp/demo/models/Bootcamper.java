package com.openbootcamp.demo.models;

public class Bootcamper {
    private String name;
    private int age;
    private int id;

    public Bootcamper() {
    }

    public Bootcamper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* getters */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

}
