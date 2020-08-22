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
public class secondprogram {
    public static void main(String args[]){
     Scanner o=new Scanner(System.in);
        bond obj1[]=new bond[6];
        convertilebond obj2[]=new convertilebond[6];
        for (int i=0;i<6;i++)
        {
        System.out.println("enter the number either 1 or 2");
        int j=o.nextInt();
        switch(j)
        {
            case 1:
                obj1[j]=new bond();
                obj1[j].method();
                break;
            case 2:
                obj2[j]=new convertilebond();
                obj2[j].method();
                break;
            default:
                System.err.println("enter the correct input");
                break;
        }
        }
        
                
                
                
        }
        
        
    }
    

class bond
{
    public void method()
    {
     System.out.println("Bond");
    }
}
class convertilebond extends bond
{
    public void method()
    {
        
        System.out.println("convertilebond");
    }
}
