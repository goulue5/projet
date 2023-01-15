/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.variables;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class Variables {

    public static void main(String[] args) {
        // ---------------------int--------------------------
        int intA = 20;
        int intB = 15;
        System.out.println(intA);
        System.out.println(intB); 
        // --------------------------------------------------
        
        // ---------------------reel-------------------------
        float fltA = 10.5f;
        double dblA = 10.5;
        System.out.println(fltA);
        System.out.println(dblA);
        // --------------------------------------------------
        
        // ---------------------bool-------------------------
        boolean boolA = true; 
        boolean boolB = false;
        boolean boolAandB = boolA&boolB;
        boolean boolAorB = boolA|boolB;
        System.out.println(boolAandB);
        System.out.println(boolAorB);       
        // --------------------------------------------------
        
        // -------------------scanner------------------------
        Scanner scanInput  = new Scanner(System.in);
        System.out.print("Saisir une chaîne A : ");
        String strA = scanInput.next();
        System.out.print("Saisir une chaîne B : ");
        String strB = scanInput.next();
        String strAplusB = strA + " " + strB;
        System.out.println(strAplusB); 
        // --------------------------------------------------
    }
}
