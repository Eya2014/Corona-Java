/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class verif {
    public static Boolean verifAlpha(String ch) //méthode qui assure que toute la chaîne ne contient que des lettres
        {
            Boolean test = true;
            if (ch.equals("") || ch.equals(" "))
                test = false;
            else
            {char chr;
                for (int i = 0; i < ch.length(); i++)
                {
                   if(Character.isLetter(ch.charAt(i)))
                    {
                    } else {
                       test = false;
                       break;
                    }
                }
            }
            return test;
        }
     public static Boolean verifDigitOrAlpha(String ch)
        {
            Boolean test = true;
            if (ch.equals("") || ch.equals(" "))
                test = false;
            else
            {
                for (int i = 0; i < ch.length(); i++)
                {
                    if (!Character.isLetterOrDigit(ch.charAt(i)))
                    {
                        test = false;
                        break;
                    }
                }
            }
            return test;

        }
        public static Boolean verifDigit(String ch) //méthode qui assure que toute la chaîne ne contient que des chiffres
        {
            Boolean test = true;
            if (ch.equals("") || ch.equals(" "))
                test = false;
            else
            {
                for (int i = 0; i < ch.length(); i++)
                {
                    if (!Character.isDigit(ch.charAt(i)))
                    {
                        test = false;
                        break;
                    }
                }
            }
            return test;
        }

        

    @SuppressWarnings("empty-statement")
        public static Boolean verifDate(String d)
        { Date today = new Date();
          String ch= String.valueOf(d);
           boolean test = true;
            
            if(String.valueOf(d).length()!=10)
            {
                test = false; 
                System.out.println("longueur non valide");
            }
           else if (String.valueOf(d).length()==10)
            {
            if(!Character.isDigit(ch.charAt(0)))
            {
            test = false;
                System.out.println("1");
            }
            if(!Character.isDigit(ch.charAt(1)))
            {
            test = false;
             System.out.println("2");
            }
            if(!Character.isDigit(ch.charAt(3)))
            {
            test = false;
             System.out.println("3");
            }
            if(!Character.isDigit(ch.charAt(4)))
            {
            test = false;
             System.out.println("4");
            }
            if(!Character.isDigit(ch.charAt(6)))
            {
            test = false;
             System.out.println("5");
            }
            if(!Character.isDigit(ch.charAt(7)))
            {
            test = false;
             System.out.println("6");
            }
            if(!Character.isDigit(ch.charAt(8)))
            {
            test = false;
             System.out.println("7");
            }
            if(!Character.isDigit(ch.charAt(9)))
            {
            test = false;
             System.out.println("8");
            }
            if(ch.charAt(2)!='-')
            {
            test = false;
             System.out.println("9");
            }
            if(ch.charAt(5)!='-')
            {
            test = false;
             System.out.println("10");
            }
            }
            return test;
            
        }
   
}
