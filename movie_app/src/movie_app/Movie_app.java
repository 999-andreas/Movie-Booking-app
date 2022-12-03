/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie_app;

import java.io.IOException;
import java.util.ArrayList;
import static movie_app.Member.getMembers;
import static movie_app.movie.getMovies;

/**
 *
 * @author andre
 */
public class Movie_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

             
        Member M1 = new Member("SF", "ce_est_un_test", "super");
        
        M1.saveMember();
        
        ArrayList<Member> list = getMembers();
        
        System.out.println(list.get(1)); // to have juste one movie select using the index==id
      
        
        /*
        movie M1 = new movie("SF", "ce_est_un_test", "02/02/2002", 120, 7.0, true, 40, 0.2);
        
        M1.saveMovie();
        
        ArrayList<movie> list = getMovies();
        
        System.out.println(list.get(1)); // to have juste one movie select using the index==id
        */
        
        
        
        
        
        
    }
    
}
