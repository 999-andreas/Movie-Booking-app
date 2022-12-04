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
public class superUser implements user{
    
    protected int id;
    protected String first_name;
    protected String last_name;
    protected String username;
    protected String pw;
    
    
    public superUser(String first_name, String last_name, String username, String pw) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.username = username;
    this.pw = pw;
    }
    
    public static ArrayList<Member> getUsers(boolean admin)
    {
        String path;
                
        if(admin)
        {
            path = "Admins.txt";
        }
        else
            path = "Members.txt";
        
        
        try
        {
            File file = new File (path);
            Scanner inputFile = new Scanner(file);

            String str_nb = inputFile.nextLine();
            int nb_line = Integer.parseInt(str_nb);
        
            ArrayList<Member> list = new ArrayList<Member>(nb_line);

            for(int k=0;k<nb_line;k++)
            {
               String line = inputFile.nextLine();
               //System.out.println(line);  

               String[] info = line.split(";");

               list.add(new Member(info[1], info[2], info[3], info[4]));

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

    @Override
    public String toString() {
        return "superUser{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", username=" + username + ", pw=" + pw + '}';
    }


    
    
    public void saveUser(boolean admin)
    {
        String path;
        
        if(admin)
        {
            path = "Admins.txt";
        }
        else
            path = "Members.txt";
        
        ArrayList<Member> list = getUsers(admin);
        
        try
        {
            PrintWriter pW = new PrintWriter(path);
            PrintWriter outputFile = new PrintWriter(pW);
            
            outputFile.println(list.size()+1); 
            
            for (superUser a : list)
                outputFile.println(a.id + ";" + a.first_name + ";" + a.last_name + ";" +a.username+";" +a.pw); 
            
            outputFile.println(list.size() + ";" + first_name + ";" + last_name + ";" +username+ ";" + pw); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public static Member getUser(int id, boolean admin)
    {
        ArrayList<Member> list = getUsers(admin);
        
        for (int k=0;k<list.size();k++)
        {
            if(id == list.get(k).id)
            {
                return list.get(k);
            }
        }
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

}
