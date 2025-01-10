import java.util.ArrayList;
import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<TravelDestination> itinerary = new ArrayList<>();

         while (true) {
            System.out.println("\n ---Travel Itinerary Planner---");
            System.out.println("1. Add a Destination ");
            System.out.println("2. View Itinerary");
            System.out.println("3. Close");
            System.out.println("Enter Option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 : 
                System.out.println("Enter destination : ");
                String destination = sc.nextLine();
                System.out.print("Enter travel date (YYYY-MM-DD): ");
                String travelDate = sc.nextLine();
                System.out.print("Enter budget: ");
                double budget = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter preferences (optional): ");
                String preferences = sc.nextLine();
                
                // add to list 
                itinerary.add(new TravelDestination(destination, travelDate, budget, preferences));
                System.out.println("Destination added successfully!");
                    break;

                    case 2:
                    System.out.println("\n=== Your Itinerary ===");
                    if (itinerary.isEmpty()) {
                        System.out.println("No destinations added yet!");
                    } else {
                        for (int i = 0; i < itinerary.size(); i++) {
                            System.out.println("\nDestination " + (i + 1) + ":");
                            System.out.println(itinerary.get(i));
                        }
                    }
                    break;

                    case 3:
                    // Exit the program
                    System.out.println("Thank you for using the Travel Itinerary Planner!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
class TravelDestination {
    private String destination;
    private String travelDate;
    private double budget;
    private String preferences;
    
    public TravelDestination(String destination, String travelDate, double budget, String preferences) {
        this.destination = destination;
        this.travelDate = travelDate;
        this.budget = budget;
        this.preferences = preferences;
    }
    @Override
    public String toString() {
        return "Destination: " + destination +
               "\nTravel Date: " + travelDate +
               "\nBudget: $" + budget +
               "\nPreferences: " + (preferences.isEmpty() ? "None" : preferences);
    }
}



    

