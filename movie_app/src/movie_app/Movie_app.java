/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie_app;

import java.io.IOException;
import java.util.ArrayList;
import static movie_app.Member.getMembers;

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

                
        Member M1 = new Member("SF", "ce_est_un_test", "02/02/2002");
        
        M1.saveMember();
        
        ArrayList<Member> list = getMembers();
        
        System.out.println(list.get(1)); // to have juste one movie select using the index==id
    }
    
}
