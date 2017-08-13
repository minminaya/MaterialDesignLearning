package com.minminaya.materialdesigndemo.text_fields.auto_complete;

/**
 * Created by Niwa on 2017/8/13.
 */

public class Dog {
    private String name;
    private int drawableRes;

    public Dog(String name, int drawableRes) {
        this.name = name;
        this.drawableRes = drawableRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
