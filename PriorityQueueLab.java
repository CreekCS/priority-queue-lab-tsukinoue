import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueLab {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        String fileName = "RandIntegers.txt";
        
        try {
            
            Scanner fileScanner = new Scanner(new File(fileName));

            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                priorityQueue.add(number);
            }

            fileScanner.close(); 

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return; 
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            return; 
        }

        System.out.println("Priority Queue Items:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); 
        }
    }
}