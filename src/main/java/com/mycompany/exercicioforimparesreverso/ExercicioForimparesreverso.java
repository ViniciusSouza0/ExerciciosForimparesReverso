package com.mycompany.exercicioforimparesreverso;
import java.util.Scanner;
public class ExercicioForimparesreverso {
public static void main(String[] args) {

//IMPAR
Scanner teclado = new Scanner(System.in);


int x = teclado.nextInt();
for (int i = x; i>=1; i-=2) {
    System.out.println(i);
}
}
}

//PAR
//int x = teclado.nextInt();
//for (int i = x; i>=100; i+=2) {
//System.out.println(i);