/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_app;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class movie {
    private int id;
    private String genre;
    private String title;
    private String date;
    private int duration;
    private double price;
    private boolean availability;
    private int nb_place;
    private double discount;
    private String[] times;
    private String url;

    public movie(String genre, String title, String date, int duration, double price, boolean availability, int nb_place, double discount, String[] times, String url) {
        this.genre = genre;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.price = price;
        this.availability = availability;
        this.nb_place = nb_place;
        this.discount = discount;
        this.times = times;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public int getNb_place() {
        return nb_place;
    }

    public double getDiscount() {
        return discount;
    }
    
    public void saveMovie() throws IOException 
    {
        //we rewrite all the file because it size is xritten at the beginning
        ArrayList<movie> list = getMovies();
        
        try
        {
            PrintWriter pw = new PrintWriter("Movies.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
            outputFile.println(list.size()+1);
            String file_times;
            
            for (movie a : list)
            {
                file_times = "";
                for(String time :a.times)
                {
                    file_times+=time+",";
                }
                outputFile.println(a.id + ";" + a.genre + ";" + a.title + ";" + a.date + ";" + a.duration + ";" + a.price + ";" + a.availability + ";" + a.nb_place + ";" + a.discount + ";" + file_times+";"+a.url); 
            }
            
            file_times = "";
            for(String time :times)
            {
                file_times+=time+",";
            }
            outputFile.println(list.size() + ";" + genre + ";" + title + ";" + date + ";" + duration + ";" + price + ";" + availability + ";" + nb_place + ";" + discount+";"+ file_times+";"+url); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public static ArrayList<movie> getMovies() 
    {
        // vaq chercher tout les films dans le fichier
        
        try
        {
            File file = new File ("Movies.txt");
            Scanner inputFile = new Scanner(file);

            String str_nb = inputFile.nextLine();
            int nb_line = Integer.parseInt(str_nb);
        
            ArrayList<movie> list = new ArrayList<movie>(nb_line);

            for(int k=0;k<nb_line;k++)
            {
               String line = inputFile.nextLine();
               //System.out.println(line);  

               String[] info = line.split(";");
               String[] tab_times = info[9].split(",");

               list.add(new movie(info[1], info[2], info[3], Integer.parseInt(info[4]), Double.parseDouble(info[5]), Boolean.parseBoolean(info[6]), Integer.parseInt(info[7]), Double.parseDouble(info[8]), tab_times, info[10]));
               
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
    
    /*
    public movie getMovie(int id)
    {
        //vas chercher un filme en particulier en fonction de l'id (la ligne quoi)
    }*/
    
    public void modif_movie()
    {   
        ArrayList<movie> list = getMovies();
        
        for (int k=0;k<list.size();k++)
        {
            if(id == list.get(k).id)
            {
                list.set(id, new movie(genre, title, date, duration, price, availability, nb_place, discount, times, url));
            }
        }
        
        try
        {
            PrintWriter pw = new PrintWriter("Movies.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
            outputFile.println(list.size()); 
            String file_times;
            
            for (movie a : list)
            {
                file_times = "";
                for(String time :a.times)
                {
                    file_times+=time+",";
                }
                
                outputFile.println(a.id + ";" + a.genre + ";" + a.title + ";" + a.date + ";" + a.duration + ";" + a.price + ";" + a.availability + ";" + a.nb_place + ";" + a.discount+ ";"+times+";"+url); 
            }
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }     
    }

    
    
    public void setId(int id) {
        this.id = id;
    }
    
    /*
    faire une method de tri des films 
    
    */

    @Override
    public String toString() {
        return "movie{" + "id=" + id + ", genre=" + genre + ", title=" + title + ", date=" + date + ", duration=" + duration + ", price=" + price + ", availability=" + availability + ", nb_place=" + nb_place + ", discount=" + discount + ", times=" + times + ", url=" + url + '}';
    }

    public String[] getTimes() {
        return times;
    }

    public String getUrl() {
        return url;
    }

    
}

