import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("=" .repeat(50));
        System.out.println("PERSONAL INFORMATION COLLECTOR");
        System.out.println("=" .repeat(50));
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your gender (Male/Female/Other): ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your contact number: ");
        String contactNumber = scanner.nextLine();
        
        System.out.print("Enter your home address: ");
        String address = scanner.nextLine();
        
        System.out.print("Enter your date of birth (MM/DD/YYYY): ");
        String dateOfBirth = scanner.nextLine();
        
        System.out.print("Are you a student? (yes/no): ");
        String isStudent = scanner.nextLine();
        
        System.out.print("Enter your occupation: ");
        String occupation = scanner.nextLine();
        
        scanner.close();
        
        PersonalInfoTemp person = new PersonalInfoTemp(
            fullName, age, gender, email, contactNumber, 
            address, dateOfBirth, isStudent, occupation
        );
        
        
        person.displayInfo();
        
        System.out.println("\nThank you for providing your information, " + person.getFullName() + "!");
        System.out.println("You are " + person.getAge() + " years old.");
    }
}
