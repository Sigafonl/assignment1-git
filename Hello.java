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

<<<<<<< HEAD
            //Teeeeesting 
=======
            //Print the strings from the files
>>>>>>> 144646cb4a59bd4cce06c33731d23ec3ce833074
            while(userInput.hasNextLine()){
                System.out.println(userInput.nextLine());
            }
            userInput.close();
        } 
        catch (FileNotFoundException e){
            System.out.println("Hey friend, no file here!");
            e.printStackTrace();
        }
    }
}