/*
author John Yehia
since 10-4-2022
version 1.0
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class wavelengths {
    //we need this exception for the printstream
    public static void main(String[] args) throws FileNotFoundException {

    /*The purpose of this homework is to display the wavelengths of the different series such as Lyman, Balmer, and more.
    We display only up to 10 wavelengths per series.

    The algorithm consists of if else statements, nested for loops, and a method that calculates the wavelengths.

    This was quite a confusing project. I had to experiment a ton to achieve the desired result. Although this project was quite
    challenging, it was rewarding when I achieved the desired result, as with increased difficulty includes increased reward.
    This project was a valuable learning experience as I have finally realized that I am a textbook example of the Dunning-Kruger
    effect.
     */
        //here I created a printstream where the output will be directed
        //this is so that our printstream will append data. Without using FileOutputStream, it wouldn't print everything.
        PrintStream ps = new PrintStream(new FileOutputStream("/Users/johnyehia/Documents/seriesoutput.txt", true));
        double n1;
        double n2;
        ps.println(series(1, 2));
    }
    public static String series(double n1, double n2) {
        //Here I initialized the double wavelength
        double wavelength;
        //Here I initialized the string name
        String name = "";
        System.out.println(name);
        //this prints the result to a file

        //Here is a println that prints the name of each column
        System.out.println("n1    n2    Wavelength");

        //this below is a nested for loop with an if else statement that names the different series.
        for (int i = 1; i <= 6; i++) {
            if (i == 1) {
                name = "Lyman series";
            } else if (i == 2) {
                name = "Balmer series";
            } else if (i == 3) {
                name = "Paschen series";
            } else if (i == 4) {
                name = "Brackett series";
            } else if (i == 5) {
                name = "Pfund series";
            } else if (i == 6) {
                name = "Humphrey series";
            }
            System.out.println(name);
            int rando = i + 1;
            for (int j = 1; j <= 10; j++) {
                n1 = i;
                n2 = rando;
                //below here is where I call the calculator method.
                System.out.println(n1 + "    " + n2 + "    " + calculator(i, (int) n2) + "nm");
                rando++;
            }
            System.out.print("");
        }
        return name;
    }
    //this method below is a calculator that calculates the different wavelengths.
    public static double calculator(int numOne, int numTwo) {
        double wavelength = Math.floor(1 / ((109677.581 * Math.pow(10, -7)) * ((1 / Math.pow(numOne, 2)) - (1 / Math.pow(numTwo, 2)))));
        return wavelength;
    }
}
