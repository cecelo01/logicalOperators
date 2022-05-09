/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.logicaloperators;

/**
 *
 * @author Marce
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10, y=15, z=20;
        boolean r;
        
        r = (x>y ^ z>x)?true:false;
        System.out.println(r);
    }
    
}
