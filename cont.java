import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String n;
    private String p;
    private String e;

    public Contact(String n, String p, String e) {
        this.n = n;
        this.p = p;
        this.e = e;
    }

    public String getName() {
        return n;
    }

    public void setName(String n) {
        this.n = n;
    }

    public String getPhone() {
        return p;
    }

    public void setPhone(String p) {
        this.p = p;
    }

    public String getEmail() {
        return e;
    }

    public void setEmail(String e) {
        this.e = e;

    }

    public String toString() {
        return "Name: " + n + " Phone Number: " + p + " Email ID: " + e;
    }
}

public class cont {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Contact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    addContact(sc);
                    break;
                case 2:
                    viewContact(sc);
                    break;
                case 3:
                    updateContact(sc);
                    break;
                case 4:
                    deleteContact(sc);
                    break;
                case 5:
                    System.out.println("Thanks for Using our System");
                    return;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }

    private static void addContact(Scanner sc) {
        System.out.println("Enter contact name: ");
        String n = sc.nextLine();
        System.out.println("Enter contact phone number: ");
        String p = sc.nextLine();
        System.out.println("Enter contact email: ");
        String e = sc.nextLine();
        Contact c = new Contact(n, p, e);
        contacts.add(c);
        System.out.println("Contact added Succesfully!");
    }

    private static void viewContact(Scanner sc) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
        } else {
            for (Contact c : contacts) {
                System.out.println(c.toString());
            }
        }
    }

    private static void updateContact(Scanner sc) {
        System.out.println("Enter contact name to update: ");
        String n = sc.nextLine();
        for (Contact c : contacts) {
            if (c.getName().equals(n)) {
                System.out.println("Enter new phone number: ");
                String p = sc.nextLine();
                System.out.println("Enter new email: ");
                String e = sc.nextLine();
                c.setPhone(p);
                c.setEmail(e);
                System.out.println("Contact Updated Succesfully");
                return;
            }
        }
        System.out.println("Contact not Found!");
    }

    private static void deleteContact(Scanner sc) {
        System.out.println("Enter contact name to delete:");
        String n = sc.nextLine();
        for (Contact c : contacts) {
            if (c.getName().equals(n)) {
                contacts.remove(c);
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not Found!");
    }
}
