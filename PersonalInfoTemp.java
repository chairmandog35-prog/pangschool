public class PersonalInfoTemp{
    private String fullName;
    private int age;
    private String gender;
    private String email;
    private String contactNumber;
    private String address;
    private String dateOfBirth;
    private String isStudent;
    private String occupation;
    
    public PersonalInfoTemp() {
        this.fullName = "";
        this.age = 0;
        this.gender = "";
        this.email = "";
        this.contactNumber = "";
        this.address = "";
        this.dateOfBirth = "";
        this.isStudent = "";
        this.occupation = "";
    }
    
    public PersonalInfoTemp(String fullName, int age, String gender, 
                           String email, String contactNumber, String address,
                           String dateOfBirth, String isStudent, String occupation) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.contactNumber = contactNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.isStudent = isStudent;
        this.occupation = occupation;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getContactNumber() {
        return this.contactNumber;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public String getIsStudent() {
        return this.isStudent;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public void displayInfo() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("     COLLECTED PERSONAL INFORMATION");
        System.out.println("=".repeat(50));
        System.out.println("Full Name      : " + this.fullName);
        System.out.println("Age            : " + this.age);
        System.out.println("Gender         : " + this.gender);
        System.out.println("Email          : " + this.email);
        System.out.println("Contact Number : " + this.contactNumber);
        System.out.println("Address        : " + this.address);
        System.out.println("Date of Birth  : " + this.dateOfBirth);
        System.out.println("Student?       : " + this.isStudent);
        System.out.println("Occupation     : " + this.occupation);
        System.out.println("=".repeat(50));
    }
}