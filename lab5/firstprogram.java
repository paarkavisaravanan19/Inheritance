/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class firstprogram {
    public static void main(String args[]){
        circle obj2=new circle();
        obj2.areacal();
        obj2.circumcal();
        square obj3=new square();
        obj3.areacal1();
        obj3.diasq();
        sphere obj4=new sphere();
        obj4.volume();
        obj4.sufacearea();
        
    }
    
}
class shape
{
    double radius;
    double pi=3.14;
    double length;
    double radius1;
    double a=4/3;
    Scanner obj=new Scanner(System.in);
    shape(double r,double l,double r1)
    {
     radius=r;   
     length=l;
     radius1=r1;
    }
    shape()
    {
        
    }

}
class circle extends shape
{
    public void areacal()
    {
        System.out.println("CIRCLE");
        System.out.println("enter the radius of the circle");
        radius=obj.nextDouble();
        double area=pi*radius*radius;
        System.out.println("area:"+area);
    }
    public void circumcal()
    {
        double circum=2*pi*radius;
        System.out.println("circumference of the circle "+circum);
    }
}
class square extends shape
{
    public void areacal1()
    {
        System.out.println("SQUARE");
        System.out.println("enter the side ");
        length=obj.nextDouble();
        double areasq=length*length;
        System.out.println("area of square "+areasq);
    }
    public void diasq()
    {
        double diagonal=Math.sqrt(2)*length;
        System.out.println("diagonal of the square:"+diagonal);
    }
}
class sphere extends shape
{
    public void volume()
    {
        System.out.println("SPHERE");
        System.out.println("enter the radius of the sphere");
        radius1=obj.nextDouble();
        double volsp=a*pi*radius1*radius1*radius1;
        System.out.println("Volume "+volsp);
    }
    public void sufacearea()
    {
     double surface=4*pi*radius1*radius1;
      System.out.println("Surface area of the sphere "+surface);
    }
    
}

