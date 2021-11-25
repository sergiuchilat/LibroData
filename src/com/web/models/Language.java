package com.web.models;

import java.util.Date;
import java.util.List;

public class Language {
    private int ID;
    private String code;
    private String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "ID=" + ID +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
