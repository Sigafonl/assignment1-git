import java.util.Scanner;

import java.util.*;
import java.io.*;

class Hello{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter Hey.txt, Goodnight.txt, or Testing_Server.txt: ");
        String fileName  = keyboard.nextLine();
        File inFile = new File(fileName);
        
        System.out.println();//need an extra space here 

        try{
            Scanner userInput = new Scanner(inFile);

            while(userInput.hasNextLine()){
                System.out.println(userInput.nextLine());
            }
            userInput.close();
        } 
        catch (FileNotFoundException e){
            System.out.println("Hey goober, no file here!");
            e.printStackTrace();
        }
    }
}