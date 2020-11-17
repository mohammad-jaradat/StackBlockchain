/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author mjaradat
 */
public class Main {

    Queue<String> lines;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*** TODO-0 fill your student id and name  ***/
        String studentName="Mohammad Jaradat";
        String studentId="111111";
        
        
        
        BitcoinSystem bitcoinSystem =new BitcoinSystem(studentName,studentId);
        
        /*** TODO-1 implement the read from file, check the method for more details ***/
        bitcoinSystem.readBlocksFile();
        
         /*** TODO-2 implement methods in Stack class 
          ***/
        
        /*** TODO-3 implement the read from file, check the method for more details ***/
        bitcoinSystem.addToStack();
        /*** TODO-4 implement the read from file, check the method for more details ***/
        bitcoinSystem.SumAllStackNumbers();
        
    }

    
  

    
}
