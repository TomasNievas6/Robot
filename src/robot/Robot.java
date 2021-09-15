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
public class Robot {
    private double  bateria = 1000;
    private boolean estaDormido = false;
    
    /**
     *
     */
    
    public Robot(){
        this.bateria = 1000;
        this.estaDormido = false;
    }
    
    public void avanzar(int cantidadDePasos){
        int camino = cantidadDePasos/10;
        if (bateria >= camino && !estaDormido ){
            bateria -= camino;
        }else{
            System.out.println("El robot no puede realizar esta accion");
        }
    }
    
    public void retroceder(int cantidadDePasos){
        int camino = cantidadDePasos/10;
        if (bateria >= camino){
            bateria -= camino;
        }else{
            System.out.println("El robot no puede realizar esta accion");
        }
    }
    
    public void dormir(){
        estaDormido = true;
    }
    
    public void despertar(){
        estaDormido = false;
    }
    
    public void recargar(){
        bateria = 1000;
    }
    
    public boolean bateriaLlena(){
        return bateria == 1000;
    }
    
    public boolean bateriaVacia(){
        return bateria == 0;
    }
    
    public double energiaActual(){
        return bateria;
    }

    public double getEnergia() {
        return bateria;
    }

   
    
}
