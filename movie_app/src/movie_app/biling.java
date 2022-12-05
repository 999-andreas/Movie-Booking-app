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
    private movie Movie;
    private Member member;
    private int nb_tickets;
    private String time;
    private double total;
    
    public biling(movie Movie, Member member, int nb_tickets) {
        this.Movie = Movie;
        this.member = member;
        this.nb_tickets = nb_tickets;
        this.time = time;
    }

    public void setId(int id) {
        this.id = id;
    }

        
    public void computeBill()  
    {

        
        if(member.getId()== -1) // -1 as id when its a guest
        {
            total = Movie.getPrice()*nb_tickets;
        }
        else
            total = (Movie.getPrice()-(Movie.getPrice()*Movie.getDiscount()*nb_tickets));
        
        String[][] list = getBills();
        
        try
        {
            PrintWriter pW = new PrintWriter("Bills.txt");
            PrintWriter outputFile = new PrintWriter(pW);
            
            outputFile.println((list.length)+1); 
            
            for (String[] a : list)
                outputFile.println(a[0] + ";" + a[1] + ";" + a[2] + ";" +a[3]+";" +a[4]); 
            
            outputFile.println(list.length + ";" + member.first_name + ";" + member.last_name + ";" +member.username+ ";" + member.pw); 
                
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
        
            String[][] list = new String[nb_line][6];
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
}
