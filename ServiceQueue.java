package servicequeue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class ServiceQueue {

    public static void main(String[] args) {
       Scanner pio = new Scanner(System.in);
       Queue<String> students = new LinkedList<>();
       
        System.out.print("Enter 1st student: ");
        students.offer(pio.nextLine());        
        System.out.print("Enter 2nd student: ");
        students.offer(pio.nextLine());       
        System.out.print("Enter 3rd student: ");
        students.offer(pio.nextLine());
        
        System.out.println("\nInitial Queue: " + students);
        
        String served = students.poll();
        
        System.out.println("\nServing: " + served);
        System.out.println("Queue after serving " + served + ": " + students);
        
        System.out.print("\nEnter new student: ");
        String newStudent = pio.nextLine();
        
        students.offer(newStudent);
        
        System.out.println("Updated Queue: " + students);
        System.out.println("\n--- Service Order ---");
        
        while(!students.isEmpty()){
            String student = students.poll();
            System.out.println("Serving: " + student);
        }
        System.out.println("\nAll students have been served.");
        pio.close();
    }
    
}
