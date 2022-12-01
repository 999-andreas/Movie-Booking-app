/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_app;

import java.util.ArrayList;
import java.util.Date;
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
    private Date date;
    private int duration;
    private double price;
    private boolean availability;
    private int nb_place;
    private double discount;

    public movie(int id, String genre, String title, Date date, int duration, double price, boolean availability, int nb_place, double discount) {
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.price = price;
        this.availability = availability;
        this.nb_place = nb_place;
        this.discount = discount;
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

    public Date getDate() {
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
    
    public void saveMovie() throws IOException // bien mettre les test d'execption
    {
        //update le fichier avec une nouvelle ligne
        FileWriter fw = new FileWriter("Movies.txt", true);
        
        PrintWriter outputFile = new PrintWriter(fw);
        outputFile.println(id + "," + genre + "," + title + "," + date + "," + duration + "," + price + "," + availability + "," + nb_place + "," + discount); 
        outputFile.close(); 
        
    }
    
    public ArrayList<movie> getMovies() throws FileNotFoundException
    {
        // vaq chercher tout les films dans le fichier
        
        
        
        
        
        File file = new File("Movie.txt");
        Scanner inputFile = new Scanner(file);
        
        int nb_line =
        
        ArrayList<movie> list = new ArrayList<movie>();
        
        while (inputFile.hasNext())
        {
           String str = inputFile.nextLine();
           System.out.println(str);
        }
        
        
    }
    
    /*
    public movie getMovie(int id)
    {
        //vas chercher un filme en particulier en fonction de l'id (la ligne quoi)
    }*/
    
    
    /*
    problématique : 
    comment avoir des id unique, sachant que on peut pas savoir le num de la dernière ligne 
    
    peut etre mettre des trucs aleatoire en fonction du temps
    
    comment je peux savoir le nombre de ligne dans un fichier, parce que j'en ai besoin pour déclarer la bonne taille de tab
    */

    @Override
    public String toString() {
        return "movie{" + "id=" + id + ", genre=" + genre + ", title=" + title + ", date=" + date + ", duration=" + duration + ", price=" + price + ", availability=" + availability + ", nb_place=" + nb_place + ", discount=" + discount + '}';
    }
}

