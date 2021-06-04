package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem15 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("What is the Username? ");
        String idc = a.nextLine();
        System.out.print("What is the password? ");
        String pw = a.nextLine();
        if(idc.equals("steve")&&pw.equals("12345"))
            System.out.println("Welcome!");
        else System.out.println("I don't know you.");
    }
}
