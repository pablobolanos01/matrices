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
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int array[][];
        int letraa=0;
        int letrab=0;
        int letrac=0;
        int letrad=0;
        int letrae=0;
        int letraf=0;
        int letrag=0;
        int letrah=0;
        int letrai=0;
        int letraj=0;
        int letrak=0;
        int letral=0;
        int letram=0;
        int letran=0;
        int letrao=0;
        int letrap=0;
        int letraq=0;
        int letrar=0;
        int letras=0;
        int letrat=0;
        int letrau=0;
        int letrav=0;
        int letraw=0;
        int letrax=0;
        int letray=0;
        int letraz=0;
        array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = r.nextInt(25) + 1;
                array[i][j] = array[i][j] + 64;
                System.out.print((char)array[i][j] + " ");
                if(array[i][j]==65){
                    letraa=letraa+1;
                }
                if(array[i][j]==66){
                    letrab=letrab+1;
                }
                if(array[i][j]==67){
                    letrac=letrac+1;
                }
                if(array[i][j]==68){
                    letrad=letrad+1;
                }
                if(array[i][j]==69){
                    letrae=letrae+1;
                }
                if(array[i][j]==70){
                    letraf=letraf+1;
                }
                if(array[i][j]==71){
                    letrag=letrag+1;
                }
                if(array[i][j]==72){
                    letrah=letrah+1;
                }
                if(array[i][j]==73){
                    letrai=letrai+1;
                }
                if(array[i][j]==74){
                    letraj=letraj+1;
                }
                if(array[i][j]==75){
                    letrak=letrak+1;
                }
                if(array[i][j]==76){
                    letral=letral+1;
                }
                if(array[i][j]==77){
                    letram=letram+1;
                }
                if(array[i][j]==78){
                    letran=letran+1;
                }
                if(array[i][j]==79){
                    letrao=letrao+1;
                }
                if(array[i][j]==80){
                    letrap=letrap+1;
                }
                if(array[i][j]==81){
                    letraq=letraq+1;
                }
                if(array[i][j]==82){
                    letrar=letrar+1;
                }
                if(array[i][j]==83){
                    letras=letras+1;
                }
                if(array[i][j]==84){
                    letrat=letrat+1;
                }
                if(array[i][j]==85){
                    letrau=letrau+1;
                }
                if(array[i][j]==86){
                    letrav=letrav+1;
                }
                if(array[i][j]==87){
                    letraw=letraw+1;
                }
                if(array[i][j]==88){
                    letrax=letrax+1;
                }
                if(array[i][j]==89){
                    letray=letray+1;
                }
                if(array[i][j]==90){
                    letraz=letraz+1;
                }
            }
            System.out.println();
        }
        System.out.println("a : "+letraa);
        System.out.println("b : "+letrab);
        System.out.println("c : "+letrac);
        System.out.println("d : "+letrad);
        System.out.println("e : "+letrae);
        System.out.println("f : "+letraf);
        System.out.println("g : "+letrag);
        System.out.println("h : "+letrah);
        System.out.println("i : "+letrai);
        System.out.println("j : "+letraj);
        System.out.println("k : "+letrak);
        System.out.println("l : "+letral);
        System.out.println("m : "+letram);
        System.out.println("n : "+letran);
        System.out.println("o : "+letrao);
        System.out.println("p : "+letrap);
        System.out.println("q : "+letraq);
        System.out.println("r : "+letrar);
        System.out.println("s : "+letras);
        System.out.println("t : "+letrat);
        System.out.println("u : "+letrau);
        System.out.println("v : "+letrav);
        System.out.println("w : "+letraw);
        System.out.println("x : "+letrax);
        System.out.println("y : "+letray);
        System.out.println("z : "+letraz);
    }
}