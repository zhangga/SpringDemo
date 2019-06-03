package com.abc.springdemo.pojo;

public enum SexEnum {
    MALE(1, "男"),
    FEMALE(2, "女"),
    ;

    private int id;
    private String name;
    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getEnumById(int id) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.id == id)
                return sex;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
