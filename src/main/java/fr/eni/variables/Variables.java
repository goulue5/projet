/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.variables;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
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
        
        // -------------------liste--------------------------
        String[] arrStrA = {"a", "b", "c", "d"};
        int[] arrIntA = {10 , 20, 30, 40};
        double[] arrDblA = {1.1, 1.2, 1.3, 1.4};
        System.out.println(arrStrA[0]);
        System.out.println(arrIntA[0]);
        System.out.println(arrDblA[0]);
        
        int intTailleArrStrA = arrStrA.length;
        System.out.println(intTailleArrStrA);
        
        arrStrA[1] = "e";
        System.out.println(Arrays.toString(arrStrA));
        arrDblA[0] = 0;
        System.out.println(Arrays.toString(arrDblA));
        // --------------------------------------------------
        
    }
}
