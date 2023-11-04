/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_sebastiancastillo;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Lab4P1_SebastianCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner leer=new Scanner(System.in);
        Scanner teclado=new Scanner(System.in);
        System.out.println("----- M E N U -----");
        System.out.println("1.Inversión especial ");
        System.out.println("2.Balanza de cadenas ");
        System.out.println("3.Cifrado de mensajes ");
        System.out.println("4.Para Salir ");
        int opcion=leer.nextInt();
        while (opcion!=4){
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese la cadena");
                    String cadena=teclado.nextLine();
                    String cadena2= "";
                    String cadena3="";
                    int resultado=cadena.length();
                    if (resultado<4){
                        System.out.println("Su cadena tiene menos de 4 caracteres");
                    } else{
                        for(int i=0;i<cadena.length();i++){                            
                           char fin=cadena.charAt(i);
                           cadena2+=fin;
                           if(i==cadena.length()-1){
                               cadena3+=" ";
                           }
                           if(fin==32||i==cadena.length()-1){
                               for(int j=cadena2.length()-1;j>=0;j--){
                                   cadena3+=cadena2.charAt(j);
                               }
                               cadena2="";
                           }
                        }
                     
                    }
                    System.out.print(cadena3);
                    
                break;    
                }
                case 2:{
                    System.out.println("Ingrese la cadena 1");
                    String cadena1=teclado.nextLine();
                    System.out.println("Ingrese la cadena 2");
                    String cadena2=teclado.nextLine();
                    System.out.println("Ingrese la caden 3");
                    String cadena3=teclado.nextLine();
                    int num=0;
                    int num2=0;
                    int num3=0;
                    for (int i=0; i<cadena1.length(); i++){
                      char caracter=cadena1.charAt(i);
                      num=num+caracter;
                    }
                     for (int i=0; i<cadena2.length(); i++){
                      char caracter=cadena2.charAt(i);
                      num2=num2+caracter;                     
                    }
                      for (int i=0; i<cadena3.length(); i++){
                      char caracter=cadena3.charAt(i);
                      num3=num3+caracter;                     
                    }
                      System.out.println("Peso cadena 1 "+num);
                      System.out.println("Peso cadena 2 "+num2);
                      System.out.println("Peso cadena 3 "+num3);
                      if(num==num2&&num==num3){
                          System.out.println("Las tres cadenas son iguales"); 
                      } else if(num>num2&&num>num3){
                          System.out.println("La cadena 1 es la mayor");
                      } else if(num2>num&&num2>num3){
                          System.out.println("La cadena 2 es la mayor");
                      } else{
                          System.out.println("La cadena 3 es la mayor");
                      }
                break;    
                }
                case 3:{
                    System.out.println("Ingrese el mensaje que desea desea cifrar");
                    String cadena1=teclado.nextLine();
                    int resultado=cadena1.length();
                    if(resultado==0){
                        System.out.println("Su cifra no puede ser nula");
                    }
                    System.out.println("El mensaje cifrado: ");
                    for(int i=0;i<cadena1.length();i++){
                        char caracter=cadena1.charAt(i);
                        int num=caracter+2;
                        char fin=(char)num;
                        System.out.print(fin);
                    }
                break;    
                }
            }
            System.out.println();
            System.out.println("----- M E N U -----");
            System.out.println("1.Inversión especial ");
            System.out.println("2.Balanza de cadenas ");
            System.out.println("3.Cifrado de mensajes ");
            System.out.println("4.Para Salir ");
            opcion=leer.nextInt();
        }//fin while
    }    
}
