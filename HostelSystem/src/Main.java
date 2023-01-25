import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Olympic Palace\n");
        System.out.println("Login into the system\nPlease enter your name:");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Rooms available:\nPress 1 for: Bed sitter\nPress 2 for: Apartment");
        int choice = input.nextInt();
        if (choice <1 || choice>2){
            System.out.println("Invalid choice");
            System.exit(0);
        }


        if (choice == 1) {
            System.out.println("You chose a Bedsitter\n");

            Bedsitter b = new Bedsitter(choice);
            double price = b.total();

            System.out.println("Olympic palace\nCustomer Name: "+name
                    +"\nInvoice details\nRoom details\nBedsitter\nSingle room\nPrice:"+ price);

        } else {
            System.out.println("You chose Apartment\n"
                            +"2 and 4 represent multiple rooms\n"
                            +"\nEnter the number of the rooms (between 2-4):");


            int numRooms = input.nextInt();
            if (numRooms < 2 || numRooms > 4) {
                System.out.println("Our apartments have a maximum of 3 rooms");
                System.exit(0);
            }

                    Onebedroom O = new Onebedroom(numRooms);
                    double Price = O.total();
                    if (numRooms>2){

                    }
                    System.out.println("Olympic palace\nCustomer Name: "+name
                            +"\nInvoice details\nRoom details\nApartment\nRooms: "+ numRooms+"\nPrice:" + Price);
            }

        }
    }

