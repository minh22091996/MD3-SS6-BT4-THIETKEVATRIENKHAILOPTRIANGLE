package rikkei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Shape shape = new Shape();
        System.out.println(shape);
        System.out.println("------cac canh sau khi thay doi----");
        shape.set123(2,3,4);
        System.out.println(shape);
        System.out.println("dien tich tam giac la :" + shape.getArea());
        System.out.println("chu vi tam giac la : "+ shape.getPerimeter());
        System.out.println("-----Triangle-----");
        Triangle triangle = new Triangle();
        System.out.println("mau sac va cac canh cua tam giac ban dau la : " + triangle);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mau sac moi cho tam giac :");
        triangle.setColor(sc.next());
        System.out.println("nhap canh side1 cho tam giac");
        triangle.setSide1(sc.nextDouble());
        System.out.println("nhap canh side2 cho tam giac");
        triangle.setSide2(sc.nextDouble());
        System.out.println("nhap canh side1 cho tam giac");
        triangle.setSide3(sc.nextDouble());
        System.out.println("mau sac va cac canh cua tam giac sau khi thay doi la : " + triangle);
        System.out.println("dien tich cua tam giac sau khi thay doi la : "+triangle.getArea());
        System.out.println("chu vi cua tam giac sau khi thay doi la : "+triangle.getPerimeter());

    }
}
