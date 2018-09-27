/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 92018448
 */
//Analyse the data structure used in the task. Was the data structure
//fit for the task? Explain your answer.
//Is there another data structure
//that could be used in place of array list to complete the task?: 
//This data structure is fit for this task as you can randomly access the 
//array-list in different places eg.  Accessing an entry in the middle of the 
//list. The array list is also resizable, so you can add entry’s to it. 
//
////This task also wants a user to be able to delete and manipulate the list 
//and Arraylist allows this. Also you can use primitive types with an array 
//list so if the file that is connected has a mixture of int and string for 
//example or we need to work with numbers we can do just that. 
////
////A linked list could be used in place as Insertion and deletion is very 
//fast but we also have to think about the fact that the user in this task
//needs to search the list and as accessing elements in this kind of list 
//is done one by one, by traversing the nodes so it will end up being slower
//than the Arraylist. 
////
////A stack and a queue could not be used as you cannot access the middle 
//of the list randomly.  
public class HospitalRecords {

    public static ArrayList patientArrayList = new ArrayList();
    private static String iD;

    public static void main(String[] args) {
        System.out.println("Press S for search, Press E for exit");
        //Create scanner Object and pass string in it  
        Scanner sc = new Scanner(System.in);
         String input = sc.next();
         System.out.println(input);
     if ( input.equals("E")) {
          System.exit(0);
     }else if ( input.equals("S")){
        
         
      
        System.out.println("--------Enter Your Details-------- ");
        Scanner search = new Scanner(System.in);
        System.out.print("Enter Patient ID to search: ");
        iD = search.next();
        System.out.println("ID: " + iD);
       

        obtainRecords("H:\\Documents\\PersonList.csv");

        getPatient();
     }
    }
    
    public static void getPatient() {
        for (Object pat : patientArrayList) {
            patient pata = (patient) pat;
            if (pata.getId().equals(iD)) {
                System.out.println(pata);
            }
        }
    }

    public static void obtainRecords(String hDocumentsPersonListcsv) {
        String path = "H:\\Documents\\PersonList.csv";
//Use path to the ListOfPatients.txt here
        LineNumberReader lr = null;
//allows to read information from the file line by line
        String[] oneRecord = new String[4];
//an array to store info about one patient
        patient pat;
        try {
//using try-catch for exception handling to catch
//possible errors with i/o operations
            FileReader inputStream = new FileReader(path);
//FileReader reads the file’s contents
            lr = new LineNumberReader(inputStream);
            String str;
            while ((str = lr.readLine()) != null) {
//while the next line exists
                oneRecord = str.split(",");
//dividing one file line by commas and assigning to array
                pat = new patient(oneRecord[0], oneRecord[1],
                        oneRecord[2], oneRecord[3]);
                patientArrayList.add(pat);

            }
        } catch (IOException ioe) {
            System.out.println("IOExcception occured");
        }
}

}

