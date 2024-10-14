import java.util.LinkedList;
import java.util.Scanner;

public class GFG {

    public static void main(String[] args) {
        // Creating a linked list object
        LinkedList<String> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the menu
            System.out.println("\nMenu:");
            System.out.println("1. Add element at end");
            System.out.println("2. Add element at beginning");
            System.out.println("3. Add element at specific index");
            System.out.println("4. Remove element by value");
            System.out.println("5. Remove element by index");
            System.out.println("6. Remove first element");
            System.out.println("7. Remove last element");
            System.out.println("8. Display linked list");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    // Add element at end
                    System.out.print("Enter element to add at end: ");
                    ll.add(scanner.nextLine());
                    break;

                case 2:
                    // Add element at beginning
                    System.out.print("Enter element to add at beginning: ");
                    ll.addFirst(scanner.nextLine());
                    break;

                case 3:
                    // Add element at specific index
                    System.out.print("Enter index to add element: ");
                    int indexToAdd = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter element to add: ");
                    ll.add(indexToAdd, scanner.nextLine());
                    break;

                case 4:
                    // Remove element by value
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    if (ll.remove(elementToRemove)) {
                        System.out.println(elementToRemove + " removed from the list.");
                    } else {
                        System.out.println(elementToRemove + " not found in the list.");
                    }
                    break;

                case 5:
                    // Remove element by index
                    System.out.print("Enter index to remove element: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (indexToRemove < ll.size() && indexToRemove >= 0) {
                        ll.remove(indexToRemove);
                        System.out.println("Element at index " + indexToRemove + " removed.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 6:
                    // Remove first element
                    if (!ll.isEmpty()) {
                        ll.removeFirst();
                        System.out.println("First element removed.");
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;

                case 7:
                    // Remove last element
                    if (!ll.isEmpty()) {
                        ll.removeLast();
                        System.out.println("Last element removed.");
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;

                case 8:
                    // Display linked list
                    System.out.println("Linked List: " + ll);
                    break;

                case 9:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
