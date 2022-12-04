/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movie_app;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public interface user {
    public ArrayList<superUser> getUsers();
    
    public superUser saveUser();
    
    public superUser getUser();
}
