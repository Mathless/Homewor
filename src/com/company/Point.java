package com.company;

import java.sql.SQLOutput;

public class Point {

    double x = 10.0;
    double y = 9.0;

    public Point(){
        x = x;
        y = y;
    }

    public double pin () {//метод выводит координаты точки
        System.out.println(x+" "+y);
        return 0;
    }
    public double add (double a, double b) {//метод выводит координаты точки с прибавленными к ним значениями вводимыми пользователем
        System.out.println(x+a+" "+y+b);
        return 0;
    }
    public double r (){ //метод находит радиус вектор до точки
        System.out.println(Math.round(Math.sqrt(x*x+y*y)));
        return x;
    }
}
