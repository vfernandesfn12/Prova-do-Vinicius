/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vinicius_q2;

import java.util.Scanner;

/**
 *
 * @author vnovaes
 */
public class Vinicius_Q2 {

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digita sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Agora digite quantos meses: ");
        int meses = teclado.nextInt();
        System.out.println("Digite quantos dias: ");
        int dias = teclado.nextInt();
    
        int totaldias = (idade*meses+dias);
        
        System.out.println("Você possui essa quantidade de dias de idade " + totaldias);
        
        
    }
}
