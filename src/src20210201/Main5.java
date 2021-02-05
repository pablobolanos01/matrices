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
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[][];
        num = new int[5][3];
        Random r=new Random();
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                num[i][j]=r.nextInt(8)+1;
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        int fila=r.nextInt(num.length);
        int columna=r.nextInt(num[0].length);
        System.out.println("fila aleatoria: "+(fila+1));
        System.out.println("columna aleatoria: "+(columna+1));
        System.out.println("elemento aleatorio: "+num[fila][columna]);
    }
}