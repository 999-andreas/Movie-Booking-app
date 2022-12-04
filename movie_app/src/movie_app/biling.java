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
    
    
        /*
        private double price;
        private int nb_place;
        private int id_person;
        private int id_film;
        private double discount;
        private double total;
        */

    public biling(double price, int nb_place, int id_person, int id_film, double discount, double total, String time) {
        this.price = price;
        this.nb_place = nb_place;
        this.id_person = id_person;
        this.id_film = id_film;
        this.discount = discount;
        this.total = total;
        this.time = time;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }

        
    public void computeBill()
    {
        //calcule le total avec discount
        // envoie tout dans le fichier texte
        
    }
    
    public ArrayList<biling> getBills()
    {
        try
        {
            File file = new File ("Bills    .txt");
            Scanner inputFile = new Scanner(file);

            String str_nb = inputFile.nextLine();
            int nb_line = Integer.parseInt(str_nb);
        
            ArrayList<biling> list = new ArrayList<biling>(nb_line);

            for(int k=0;k<nb_line;k++)
            {
               String line = inputFile.nextLine();
               //System.out.println(line);  

               String[] info = line.split(";");

               list.add(new biling(Double.parseDouble(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), Integer.parseInt(info[5]), Double.parseDouble(info[6]),Double.parseDouble(info[7]), info[8]));
               
               list.get(k).setId(k);
               //System.out.println(id+genre+date);
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
