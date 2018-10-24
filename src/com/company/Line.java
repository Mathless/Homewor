package com.company;

public class Line {

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
    public Line(){
        x=this.x;
        y=this.y;
        x1=this.x1;
        y1=this.y1;
    }
    public double pinline(){//Вывести координаты
        System.out.println("Coordinates: "+x+", "+y+" and "+x1+", "+y1);
        return 0;
    }

    
    public boolean bool() {
        return (x2-x)/(x1-x)==(y2-y)/(y1-y);
    }//Проверить лежит точка на прямой или нет (возвращает true/false)

    public double length() { //Вернуть длину отрезка
        return Math.round(Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)));
    }
    public double CornerOx(){ //Вернуть угол отрезка относительно оси ОХ
        return  Math.atan(Math.abs((y1-y))/Math.abs((x1-x)));
    }
}
