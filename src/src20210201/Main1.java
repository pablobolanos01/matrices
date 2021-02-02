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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[][];
        num = new int[4][5];
        Random r=new Random();
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                num[i][j]=r.nextInt(8)+1;
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
