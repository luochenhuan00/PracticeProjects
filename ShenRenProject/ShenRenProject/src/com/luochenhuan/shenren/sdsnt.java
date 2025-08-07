package com.luochenhuan.shenren;

public class sdsnt {
    private String name;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public sdsnt() {
    }

    public sdsnt(String name) {
        this.name = name;
    }

    public void ask(String words) {
        System.out.println(this.name + words);
    }
}
