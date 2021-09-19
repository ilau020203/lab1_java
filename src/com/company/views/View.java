package com.company.views;
import java.util.Arrays;
import  java.util.Scanner;
/**
 * @author ilau020203
 * @version 0.0.1
 */

public class View {
    /**
     * return array of string  from console
     * @return  strings[10]
     */
    static public String[] get10Strings(){
        String[] out = new String[10];
        Scanner scanner = new Scanner(System.in);
        for(int i =0 ;i<10;i++){
            out[i]=scanner.nextLine();
        }
        return  out;
    }

    /**
     * print string to console
     * @param out string array that will print
     */
    static  public void printStrings(String[] out ){
        System.out.println(Arrays.toString(out));
    }

}
