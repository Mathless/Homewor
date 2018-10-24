package com.company;

public class Crush extends Line {
    double x1 = 18.0;
    double x2 = 17.0;
    double y1 = 16.0;
    double y2 = 15.0;
    double x3 = 14.0;
    double x4 = 13.0;
    double y3 = 12.0;
    double y4 = 11.0;
    double x = 10.0;
    double y = 9.0;
    public Crush(){
        x=this.x;
        y=this.y;
        x1=this.x1;
        y1=this.y1;
        x2=this.x2;
        y2=this.y2;
    }
    }
    @Override
    public double CornerCrush() { // Вернуть угол центрального перегиба
        return  180 - Math.atan(Math.abs(y1-y)/Math.abs(x1-x))-Math.atan(Math.abs(y2-y)/Math.abs(x2-x));
    }
    @Override
    public double pinline() {
        System.out.println("1st (x,y) is "+x+" "+y+" and 2nd (x,y) is "+x1+" "+y1+" and 3rd (x,y) is"+x2+" "+y2);
        return 0;
    public boolean bool() {//Проверить лежит точка на кривой или нет (возвращает true/false)
        return (x2-x)/(x1-x)==(y2-y)/(y1-y) || (x2-x3)/(x4-x3)==(y2-y3)/(y4-y3);
    }
}
