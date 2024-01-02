package com.main;
import processing.core.PApplet;

class Ball  {
    private int xCordinate;
    private int yCordinate;
    private int speed;
    private  int diameter;
    PApplet drawingProvider;

    Ball(){
        xCordinate = 5;
        yCordinate = 5;
        speed = 1;
        diameter = 20;
    }
    Ball(int xCordinate , int yCordinate , int speed , int diameter , PApplet drawingProvider){
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.speed = speed;
        this.diameter = diameter;
        this.drawingProvider = drawingProvider;
    }

    public void drawBall(){

        drawingProvider.ellipse(xCordinate,yCordinate,diameter,diameter);

    }

    public void moveBall(){
        drawBall();
        xCordinate +=speed;

    }


}

public class MovingBallsOOP extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.main.MovingBallsOOP", args);
    }
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 1100;
    Ball firstBall = new Ball(0,0*WINDOW_HEIGHT/5+50,1,50,this);
    Ball secondBall = new Ball(0,1*WINDOW_HEIGHT/5+50,2,50,this);
    Ball thirdBall = new Ball(0,2*WINDOW_HEIGHT/5+50,3,50,this);
    Ball fourthBall = new Ball(0,3*WINDOW_HEIGHT/5+50,4,50,this);


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
        firstBall.moveBall();
        secondBall.moveBall();
        thirdBall.moveBall();
        fourthBall.moveBall();


    }




}
