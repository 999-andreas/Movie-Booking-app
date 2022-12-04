/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie_app;

import java.io.IOException;
import java.util.ArrayList;
import static movie_app.Member.*;
import static movie_app.superUser.*;

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

             
        Member M1 = new Member("jean", "castre","yes", "BBBBBBB");
        
        //M1.saveUser(false);
        
        ArrayList<Member> list = getUsers(false);
        
        deleteMember(6,false);
        
        System.out.println(list.get(0)); // to have juste one movie select using the index==id
      
        
        /*
        movie M1 = new movie("SF", "ce_est_un_test", "02/02/2002", 120, 7.0, true, 40, 0.2);
        
        M1.saveMovie();
        
        ArrayList<movie> list = getMovies();
        
        System.out.println(list.get(1)); // to have juste one movie select using the index==id
        */
        
        
        
        
        
        
    }
    
}
