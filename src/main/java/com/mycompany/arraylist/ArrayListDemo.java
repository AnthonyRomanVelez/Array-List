
package com.mycompany.arraylist;

import java.util.Scanner;

public class ArrayListDemo {
   public static void main(String[] args) {
      int[] numbers = { 3, 2, 84, 18, 91, 6, 19, 12 };
      
      // Initialize a new ArrayList and add numbers
      ArrayList myList = new ArrayList();
      for (int number : numbers)
         myList.append(number);

      // Show the array before the operation
      System.out.println("-- Array before operation --");
      myList.printInfo();
      System.out.println();
      myList.print();
      System.out.println();
      
      myList.append(25);  // Append a number to the array
      myList.printInfo();
      System.out.println();
      myList.print();
      System.out.println();
      
      myList.prepend(33);  // Prepend a number to the array
      myList.printInfo();
      System.out.println();
      myList.print();
      System.out.println();
      
      myList.insertAfter(2,9);  // Insert 9 after index 2
      myList.printInfo();
      System.out.println();
      myList.print();
      System.out.println();
      
       myList.removeAt(7);  // Remove intem at index 7
      myList.printInfo();
      System.out.println();
      myList.print();
      System.out.println();
      
       myList.search(55);  // Search an item and return true if the item exist
       System.out.println();
      myList.search(33);  // Search an item and return true if the item exist
      //System.out.println();
      
       myList.print();  // Print the array
       
       
      
      
      
      
      
      
   }
}
