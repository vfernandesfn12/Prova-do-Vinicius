package com.mycompany.vinicius_q6;


import java.util.Scanner;


public class Vinicius_Q6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor1 = teclado.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = teclado.nextInt();
        
        int soma = (valor1 + valor2);
       float media = (valor1 + valor2)/2;
       
        System.out.println("A soma dos valores é " + soma);
        System.out.println("A média dos valores é " + media);
        System.out.println("A quantidade de valores digitados foram 2!");
        
        
    }
}
