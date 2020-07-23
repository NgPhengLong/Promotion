package com.example.promotion;

public class item {

    int background;
    String massageName;

    public item() {

    }

    public item(int background, String messageName) {
        this.background = background;
        this.massageName = messageName;
    }

    public int getBackground(){
        return background;
    }

    public String getMassageName() {
        return massageName;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setMassageName(String massageName) {
        this.massageName = massageName;
    }

}
