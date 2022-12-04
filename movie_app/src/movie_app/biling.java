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
    
    public biling(movie Movie, Member member, int nb_tickets, String time) {
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
        
        try
        {
            FileWriter pw = new FileWriter("Bills.txt", true);
            PrintWriter outputFile = new PrintWriter(pw);
                        
            outputFile.println(member.getFirst_name() + ";" + member.getLast_name() + ";" + Movie.getTitle() + ";" + Movie.getPrice() + ";" + nb_tickets + ";" + total); 
                
            outputFile.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public String[][] getBills()
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
