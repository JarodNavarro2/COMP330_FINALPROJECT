/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readexcel_noapache;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The_Master
 */
public class ReadExcel_NOAPACHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> subject = new ArrayList<String>();
        ArrayList<String> course = new ArrayList<String>();
        ArrayList<String> section = new ArrayList<String>();
        ArrayList<String> meeting_time = new ArrayList<String>();
        ArrayList<String> meeting_date = new ArrayList<String>();
        // TODO code application logic here
        System.out.print("Enter the filename ->");
        Scanner fileinput = new Scanner(System.in);
        String filename = fileinput.nextLine();
        File file = new File(filename);
        try {
            Scanner read = new Scanner(file);
            while (read.hasNext())
            {
               int iterate = 0;
               String data = read.next();
               String [] parse = data.split(",");
               for (String s: parse) //Here is the bug. Storing all the information into one array, instead of multiple.
               {
                   name.add(s);
                   subject.add(s);
                   course.add(s);
                   section.add(s);
                   meeting_time.add(s);
                   meeting_date.add(s);
               }
            }
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadExcel_NOAPACHE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*for (int i =0; i < subject.size(); i++)
        {
            System.out.println(subject.get(i));
        }
        Testing to insure the arrays were put in properly.
        */
        
        System.out.println("Enter a professors name");
        Scanner cmd = new Scanner(System.in);
        String search = cmd.nextLine();
        int position=0;
        for (int i = 0; i < name.size(); i++)
        {
            
            if (name.get(i).equals(search))
            {
                position = i;
                break;
            }
            else
            {
                System.out.println("Professor not listed");
            }
        }
        System.out.println("Professor name " + name.get(position));
        System.out.println("Subject " + subject.get(position));
        System.out.println("Course "+ course.get(position));
        System.out.println("Section " + section.get(position));
        System.out.println("Meeting time" + meeting_time.get(position));
        System.out.println("Meeting date " + meeting_date.get(position));
    }
    
}
