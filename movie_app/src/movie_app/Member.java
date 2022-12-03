/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie_app;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Member 
{
    protected int id;
    protected String first_name;
    protected String last_name;
    protected String pw;

    public Member(String first_name, String last_name, String pw) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", pw=" + pw + '}';
    }
    
    public void saveMember()
    {
        ArrayList<Member> list = getMembers();
        
        try
        {
            PrintWriter pW = new PrintWriter("Members.txt");
            PrintWriter outputFile = new PrintWriter(pW);
            
            outputFile.println(list.size()+1); 
            
            for (Member a : list)
                outputFile.println(a.id + ";" + a.first_name + ";" + a.last_name + ";" + a.pw); 
            
            outputFile.println(list.size() + ";" + first_name + ";" + last_name + ";" + pw); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    /*
    public Member getMember()
    {
        
    }*/
    
    public static ArrayList<Member> getMembers()
    {
        try
        {
            File file = new File ("Members.txt");
            Scanner inputFile = new Scanner(file);

            String str_nb = inputFile.nextLine();
            int nb_line = Integer.parseInt(str_nb);
        
            ArrayList<Member> list = new ArrayList<Member>(nb_line);

            for(int k=0;k<nb_line;k++)
            {
               String line = inputFile.nextLine();
               //System.out.println(line);  

               String[] info = line.split(";");

               list.add(new Member(info[1], info[2], info[3]));

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
    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    
    
    
}
