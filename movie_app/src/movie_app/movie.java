    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_app;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Set;

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
    private boolean availability;
    private double discount;
    private session[] sessions;
    private String url;

    public movie(String genre, String title, String date, int duration, boolean availability, double discount, session[] sessions, String url) {
        this.genre = genre;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.availability = availability;
        this.discount = discount;
        this.sessions = sessions;
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

    public boolean isAvailability() {
        return availability;
    }

    public session[] getSessions() {
        return sessions;
    }

    public double getDiscount() {
        return discount;
    }
    
    // save a new movie in the file text
    public void saveMovie() throws IOException 
    {
        //we rewrite all the file because it size is xritten at the beginning
        ArrayList<movie> list = getMovies();
        
        try
        {
            PrintWriter pw = new PrintWriter("Movies.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
            outputFile.println(list.size()+1);
            String file_sessions;
            
            for (movie a : list)
            {
                file_sessions = "";
                for(int k=0;k<a.sessions.length;k++)
                {
                    file_sessions+=a.sessions[k].getTime()+","+a.sessions[k].getPrice()+","+a.sessions[k].getNb_place();
                }
                outputFile.println(a.id + ";" + a.genre + ";" + a.title + ";" + a.date + ";" + a.duration + ";" + ";" + a.availability + ";" + ";" + a.discount + ";" + file_sessions+";"+a.url); 
            }
            
            file_sessions = "";
            for(int k=0;k<sessions.length;k++)
            {
                file_sessions+=sessions[k].getTime()+","+sessions[k].getPrice()+","+sessions[k].getNb_place();
            }
            outputFile.println(list.size() + ";" + genre + ";" + title + ";" + date + ";" + duration + ";" + ";" + availability + ";" + ";" + discount + ";" + file_sessions+";"+url); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    // get all the movies from the text file
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
               System.out.println(line);  

               String[] info = line.split(";");
               String[] str_sessions = info[7].split(",");
               session[] tab_sessions = new session[str_sessions.length];
               for(int j=0;j<str_sessions.length;j++)
               {
                   String[] str_session = str_sessions[j].split("@");
                   System.out.println(str_session[4]); /*beug ici out of range, mais ça s'affiche quand meme*/
                   tab_sessions[j] = new session(str_session[0]+"@"+str_session[1]+"@"+str_session[2],Integer.parseInt(str_session[4]), Double.parseDouble(str_session[3]));
               }
               
               
               list.add(new movie(info[1], info[2], info[3], Integer.parseInt(info[4]), Boolean.parseBoolean(info[5]), Double.parseDouble(info[6]), tab_sessions, info[8]));

                
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

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setSessions(session[] sessions) {
        this.sessions = sessions;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public void setUrl(String url) {
        this.url = url;
    }
    
    /*
    public movie getMovie(int id)
    {
        //vas chercher un filme en particulier en fonction de l'id (la ligne quoi)
    }*/
    
    // modification of a movie in the text file
    public void modif_movie()
    {   
        ArrayList<movie> list = getMovies();
        
        for (int k=0;k<list.size();k++)
        {
            if(id == list.get(k).id)
            {
                list.set(id, new movie(genre, title, date, duration, availability, discount, sessions, url));
                list.get(k).setId(k);
            }
        }
        
        try
        {
            PrintWriter pw = new PrintWriter("Movies.txt");
            try (PrintWriter outputFile = new PrintWriter(pw)) {
                outputFile.println(list.size());
                String file_sessions;
                
                
                for (movie a : list)
                {
                    file_sessions = "";
                    for(int k=0;k<a.sessions.length;k++)
                    {
                        file_sessions+=a.sessions[k].getTime()+"@"+a.sessions[k].getPrice()+"@"+a.sessions[k].getNb_place();
                    }
                    outputFile.println(a.id + ";" + a.genre + ";" + a.title + ";" + a.date + ";" + a.duration + ";"+ a.availability + ";" + a.discount + ";" + file_sessions+";"+a.url); 
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }     
    }

    public static void deleteMovie(int id)
    {
        ArrayList<movie> list = getMovies();
        
        for (int k=0;k<list.size();k++)
        {
            if(id == list.get(k).id)
            {
                list.remove(k);
            }
        }
   
        try
        {
            PrintWriter pw = new PrintWriter("Movies.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
            outputFile.println(list.size()); 
            String file_sessions;
                
                
            for (movie a : list)
            {
                file_sessions = "";
                for(int k=0;k<a.sessions.length;k++)
                {
                    file_sessions+=a.sessions[k].getTime()+"@"+a.sessions[k].getPrice()+"@"+a.sessions[k].getNb_place();
                }
                outputFile.println(a.id + ";" + a.genre + ";" + a.title + ";" + a.date + ";" + a.duration + ";"+ a.availability + ";"+ a.discount + ";" + file_sessions+";"+a.url); 
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
    faire une method update movie, beaucoup de repetitions  
    
    */

    public String getUrl() {
        return url;
    }

    
}

