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
            PrintWriter pw = new PrintWriter("Members.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
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

            String nb_line = inputFile.nextLine();
        
        
            ArrayList<Member> list = new ArrayList<Member>(Integer.parseInt(nb_line));

            while (inputFile.hasNext())
            {
               String line = inputFile.nextLine();
               //System.out.println(line);  

               String[] info = line.split(";");

               list.add(new Member(info[1], info[2], info[3]));

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
    
    public void modifMember()
    {
        
    }
    
    
}
