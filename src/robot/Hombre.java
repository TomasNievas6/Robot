/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

import java.util.Scanner;

/**
 *
 * @author TomasNievas
 */
public class Hombre {
    
    public Hombre(){}
    
    public void JugarConRobot(Robot robot){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Elija una opcion: 1 para jugar y -1 para dormir al robot");
        int pasos = sc.nextInt();
        if ( pasos == -1 ){
            robot.dormir();
            System.out.println("Acaba de poner a dormir al robot");
        }else if ( pasos == 1){
        System.out.println("Introduzca los pasos que quiere avanzar: ");
         pasos = sc.nextInt();
        robot.avanzar(pasos);
        System.out.println("Introduzca los pasos que quiere retroceder: ");
        pasos = sc.nextInt();
        robot.retroceder(pasos);
        System.out.println("La energia actual es: " + robot.getEnergia());
        }else{
            System.out.println("La opcion elejida no es correcta");
        }
    }
    
}
