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
public class Member extends superUser
{

    public Member(String first_name, String last_name, String username, String pw) {
        super(first_name, last_name, username, pw);
    }


     
    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    // modification to the text file
    public void modifMember(boolean admin)
    {
        ArrayList<Member> list = getUsers(admin);
        
        for (int k=0;k<list.size();k++)
        {
            if(id == list.get(k).id)
            {
                list.set(id, new Member(first_name, last_name,username, pw));
            }
        }
        
        try
        {
            PrintWriter pw = new PrintWriter("Members.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
            outputFile.println(list.size()); 
            
            for (Member a : list)
                outputFile.println(a.id + ";" + a.first_name + ";" + a.last_name + ";"+ a.username+ ";" + a.pw); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        } 
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    // delete a member from the text file
    public static void deleteMember(int id, boolean admin)
    {
        ArrayList<Member> list = getUsers(admin);
        
        for (int k=0;k<list.size();k++)
        {
            if(id == list.get(k).id)
            {
                list.remove(k);
            }
        }
        
        try
        {
            PrintWriter pw = new PrintWriter("Members.txt");
            PrintWriter outputFile = new PrintWriter(pw);
            
            outputFile.println(list.size()); 
            
            for(int k=0;k<list.size();k++)
                outputFile.println(k + ";" + list.get(k).first_name + ";" + list.get(k).last_name + ";"+ list.get(k).username+";" + list.get(k).pw); 
                
            outputFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        } 
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
