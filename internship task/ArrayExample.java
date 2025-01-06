import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input

        // Take the size of the array
        System.out.print("Enter the number of subject of student : ");
        int n = sc.nextInt();

        // Declare an array
        int[] array = new int[n];

        // Input elements into the array
        System.out.println("Enter grades of students of " + n + " subject");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Display the array
        System.out.print("student grades of " +n + " subject are ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // to calculate the average of grades 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = (double) sum / n;
        System.out.println("The average grade is: " + average);
        
        // to find out highest and lowest score of student 
        int highest= Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
        if (highest<array[i]){
            highest = array[i];
        }
        if(lowest>array[i]){
            lowest=array[i];
        }

        }
        System.out.println("the highest score is "+ highest);
        System.out.println("the lowest score is "+ lowest);
            }
        }
        

       

