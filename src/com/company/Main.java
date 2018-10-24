package com.company;



public class Main {

    public static void main(String[] args) {

        Point point = new Point();
        point.pin();
        System.out.println(point.add(2,5));
        System.out.println(point.r());

        Line line = new Line();

        line.pinline();
        System.out.println(line.bool());
        System.out.println(line.CornerOx());

        Crush crush = new Crush();

        System.out.println(crush.CornerCrush());
        System.out.println(crush.bool());
        crush.pinline();

    }
}
