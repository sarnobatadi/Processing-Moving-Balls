package com.main;

import processing.core.PApplet;

public class MovingBallsProcedural extends PApplet{
    public static void main(String[] args) {
        PApplet.main("com.main.MovingBallsProcedural", args);
    }
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 800;
    int speed_of_ball_1 = 0;
    int speed_of_ball_2 = 0;
    int speed_of_ball_3 = 0;
    int speed_of_ball_4 = 0;


    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {

        drawCircle(speed_of_ball_1, 50);
        drawCircle(speed_of_ball_2, 150);
        drawCircle(speed_of_ball_3, 250);
        drawCircle(speed_of_ball_4, 350);
        speed_of_ball_1++;
        speed_of_ball_2+=2;
        speed_of_ball_3+=3;
        speed_of_ball_4+=4;
    }

    private void drawCircle(int x, int y)
    {
        ellipse(x, y, 50, 50);
    }

    private void paintWhite() {
        background(255);
    }

}
