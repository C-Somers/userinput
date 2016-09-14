package userinput;

import java.util.Scanner;




public class UserInput {
 
 
   
     
    public static void main(String[] args) {
        
        System.out.println("Please enter the following information");
        System.out.println("first Name:");
        Scanner firstName = new Scanner(System.in);
       String firstNameanswer = firstName.nextLine();
        System.out.println("Surname:");
        Scanner Surname = new Scanner (System.in);
        String Surnameanswer =Surname.nextLine();
        System.out.println("School Year");
        Scanner SchoolYear = new Scanner (System.in);
        String SchoolYearanswer = SchoolYear.nextLine();
        System.out.println("Student ID");
        Scanner StudentID = new Scanner (System.in);
        String StudentIDanswer = StudentID.nextLine();
        System.out.println("Login");
        Scanner Login = new Scanner (System.in);
        String Loginanswer = Login.nextLine();
        
        System.out.println("");
        System.out.println("i have recieved this information");
        System.out.println("");
        System.out.println("First Name: " + firstNameanswer);
        System.out.println("Surname: " + Surnameanswer);
        System.out.println("School Year: " + SchoolYearanswer);
        System.out.println("Student ID: " + StudentIDanswer);
        System.out.println("Login: " + Loginanswer);
        

        
        
    }
    
}
