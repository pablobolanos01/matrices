/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src20210201;

import java.util.Random;

/**
 *
 * @author Campus FP
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[][];
        num = new int[3][2];
        Random r=new Random();
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                num[i][j]=r.nextInt(8)+1;
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        int num1=num[0][0];
        int num2=num[1][0];
        int num3=num[2][0];
        int num4=num[0][1];
        int num5=num[1][1];
        int num6=num[2][1];
        System.out.println("numero filas: "+num.length);
        System.out.println("numero columnas: "+num[0].length);
        if(num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6){
            System.out.println("mayor: "+num1);
        }
        if(num2>num1 && num2>num3 && num2>num4 && num2>num5 && num2>num6){
            System.out.println("mayor: "+num2);
        }
        if(num3>num1 && num3>num2 && num3>num3 && num3>num4 && num3>num5){
            System.out.println("mayor: "+num3);
        }
        if(num4>num1 && num4>num2 && num4>num3 && num4>num5 && num4>num6){
            System.out.println("mayor: "+num4);
        }
        if(num5>num1 && num5>num2 && num5>num3 && num5>num4 && num5>num6){
            System.out.println("mayor: "+num5);
        }
        if(num6>num1 && num6>num2 && num6>num3 && num6>num4 && num6>num5){
            System.out.println("mayor: "+num6);
        }
        if(num1<num2 && num1<num3 && num1<num4 && num1<num5 && num1<num6){
            System.out.println("menor: "+num1);
        }
        if(num2<num1 && num2<num3 && num2<num4 && num2<num5 && num2<num6){
            System.out.println("menor: "+num2);
        }
        if(num3<num1 && num3<num2 && num3<num3 && num3<num4 && num3<num5){
            System.out.println("menor: "+num3);
        }
        if(num4<num1 && num4<num2 && num4<num3 && num4<num5 && num4<num6){
            System.out.println("menor: "+num4);
        }
        if(num5<num1 && num5<num2 && num5<num3 && num5<num4 && num5<num6){
            System.out.println("menor: "+num5);
        }
        if(num6<num1 && num6<num2 && num6<num3 && num6<num4 && num6<num5){
            System.out.println("menor: "+num6);
        }
        System.out.println("suma: "+(num1+num2+num3+num4+num5+num6));
        double num1d=num1;
        double num2d=num2;
        double num3d=num3;
        double num4d=num4;
        double num5d=num5;
        double num6d=num6;
        double media=(num1d+num2d+num3d+num4d+num5d+num6d)/6;
        System.out.println("media: "+(media));
    }
}