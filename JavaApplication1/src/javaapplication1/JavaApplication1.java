/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alec
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String[] choice = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
    "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};//creates array of letters
        boolean stop = false;
        
        String sWord;//word to make to stop the program
        String mWord = "";
        Random rand = new Random();//randomizer
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\alec\\Desktop\\output.txt"));
        //change tolocation of output text file
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word for program to look for");
        sWord = input.nextLine();
        
        do{
            int spot;
            spot = rand.nextInt(27);//creates random number to use to choose a spot in the array
            
            if( choice[spot].equals(" ") || mWord.length() > 200){// creates new word when a space or more than 50 characters are used by the  gen
                System.out.println(mWord);
                writer.write(mWord);
                writer.newLine();
                mWord = "";
            }else{
                mWord = mWord + choice[spot];//creates string from random numb
            }
            //mWord = "HELLO";
            if(mWord.equals(sWord)){//stops program and prints string when word is created.
                stop = true;
                System.out.println(mWord);
                writer.write(mWord);
            }
            
            
            
        }while(stop == false);//loops program until word is found
        
        writer.close();
    }
    
}
