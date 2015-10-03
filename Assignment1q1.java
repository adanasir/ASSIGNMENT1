/**
 * Assignment 1 question 1
 * @author adanasir
 */
package assignment1q1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Assignment1q1 {

 
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
       try (
       PrintWriter writer = new PrintWriter("C:/Users/Administrator/Desktop/adanasirjava.txt", "UTF-8")) {
               writer.println("Name: Siti Aminah Shuhada Mat Nasir");
               writer.println("Matrix No.: 2014433638");
               writer.println("Gender: Female");
               writer.println("Age: 32 years old");
               writer.println("E-mail: adanasir@gmail.com");
               writer.println("Mobile Phone: 0199171336");

    }
    }
}