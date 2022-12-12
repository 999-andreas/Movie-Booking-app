/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_app;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class biling {

    private int id;
    private movie theMovie;
    private Member theMember;
    private int nb_tickets;
    private String time;
    private String time_stamp;
    private double total;
    
    public biling(movie Movie, Member member, int nb_tickets, String time, String time_stamp) {
        theMovie = Movie;
        theMember = member;
        this.nb_tickets = nb_tickets;
        this.time = time;
        this.time_stamp = time_stamp;
    }

    public void setId(int id) {
        this.id = id;
    }

        
    public void computeBill()  
    {
        if(theMember.getId()== -1) // -1 as id when its a guest
        {
            total = theMovie.getPrice()*nb_tickets;
        }
        else
            total = (theMovie.getPrice()*nb_tickets-((theMovie.getPrice()*nb_tickets)*theMovie.getDiscount()));
        
        String[][] list = getBills();
        
        try
        {
            PrintWriter pW = new PrintWriter("Bills.txt");
            PrintWriter outputFile = new PrintWriter(pW);
            
            outputFile.println((list.length)+1); 
            
            for (String[] a : list)
                outputFile.println(a[0] + ";" + a[1] + ";" + a[2] + ";" +a[3]+";" +a[4]+";"+a[5]+";"+a[6]); 
            
            outputFile.println(list.length + ";" + theMember.first_name + ";" + theMember.last_name + ";" +theMovie.getTitle()+ ";" + total+";"+time_stamp+";"+time); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public static String[][] getBills()
    {
        try
        {
            File file = new File ("Bills.txt");
            Scanner inputFile = new Scanner(file);

            String str_nb = inputFile.nextLine();
            int nb_line = Integer.parseInt(str_nb);
        
            String[][] list = new String[nb_line][7];
            for(int k=0;k<nb_line;k++)
            {
               String line = inputFile.nextLine();
               //System.out.println(line);  

               String[] info = line.split(";");
               
               list[k] = info;
               
            }
            inputFile.close();
          
            return list;
        }
        catch (FileNotFoundException e)
        {
          System.out.println("File not found.");
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public movie getTheMovie() {
        return theMovie;
    }

    public Member getTheMember() {
        return theMember;
    }

    public int getNb_tickets() {
        return nb_tickets;
    }

    public String getTime() {
        return time;
    }

    public double getTotal() {
        return total;
    }

    public String getTime_stamp() {
        return time_stamp;
    }
}
