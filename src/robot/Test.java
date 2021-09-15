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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        
        Robot robot = new Robot();
        Hombre h1 = new Hombre();
        Hombre h2 = new Hombre();
        h1.JugarConRobot(robot);
        
        h2.JugarConRobot(robot);
        
        
    }
    
}
