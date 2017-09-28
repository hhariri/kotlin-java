package com.hadihariri.demos.kotlin.clean;

class View {

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    private int color;
    private String background;
    private OnClickListenerJava onClickListener;

    public OnClickListenerJava getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListenerJava onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void initialise() {}
}
